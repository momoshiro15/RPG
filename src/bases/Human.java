package bases;

import utils.Dice;

public abstract class Human extends Living {
	// コンストラクタ
		public Human(String name, String weapon) {
			super(name,weapon);
		}

		// attackメソッドのオーバーライド
		@Override
		public void attack(Living target) {
			
			// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
			int damagePoint = Dice.get(1, 10)*getOffensive();
			// 相手のHPをダメージ値だけ減らす
			target.setHp(target.getHp()-damagePoint);
			// 自分の攻撃力を1だけ減らす
			setOffensive(getOffensive()-1);
			// コンソールにステータスを表示
			System.out.println(
					" 「"+name+"」が「"+weapon+"」で攻撃！「"+target.getName()+
					"」に"+damagePoint+"のダメージを与えた。\nしかし自分の攻撃力も1減少した。");
		}
}
