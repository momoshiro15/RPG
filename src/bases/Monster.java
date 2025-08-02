package bases;

import utils.Dice;

public abstract class Monster extends Living {
	public Monster(String name, String weapon) {
		// Livingクラスで定義したコンストラクタを利用する
		super(name,weapon);
	}

	// attackメソッドのオーバーライド
	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		int damagePoint = Dice.get(1, 10)*getOffensive();
		// 相手のHPをダメージ値だけ減らす
		target.setHp(target.getHp()-damagePoint);

		// コンソールにステータスを表示
		System.out.println(" 「"+name+"」が「"+weapon+"」で攻撃！「"+target.getName()+
				"」に"+damagePoint+"のダメージを与えた。");
	}
}
