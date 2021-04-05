package kadai;

public class Kadai23 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*	10個の整数値を入力させた後、空白で区切り一行表示する。
	  	 *	その後、探索データとして整数値を入力させ、一行表示させた10個の整数値と一致する要素を発見した場合、
		 *	その要素より前の要素を順次一つ後ろに移動させ、発見した要素を先頭に格納して、一行表示をする。*/

		int [] num = new int[10]; //要素数10個のint型配列生成
		boolean found = false; //数字が一致したかどうか判定用変数。一致したらtrueにする。
		System.out.println("10個の整数値を入力したあと検索値を入れて一致するものがあればその数字を先頭にして一行表示するプログラムです");
		for (int i = 0; i < num.length; i++) {
			System.out.println((i + 1) + "回目");
			num[i] = input(); //num[i]にinputメソッドで入力された値を代入
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println("");
		System.out.println("探索データとして整数値を1個入力してください");
		int search = input(); //inputメソッドで入力された値を変数searchに代入

		for (int i = 0; i < num.length; i++) {
			if (search == num[i]) {
				found = true; //判定用変数foundをtrueに変更
				int k = num[i]; //一致した数値を一時格納用変数kに代入
				for (int j = i; j >= 1; j--) { //一致した数値が格納されているインデックスi番目から1番目までデクリメントで繰り返し
					num[j] = num[j-1]; //j番目の左隣の要素をj番目に格納
				}
				num[0] = k; //一時避難させたi番目の要素を先頭に格納
				System.out.println("一致したのでその数字を先頭にして一行に表示します");
				for (i = 0; i < num.length; i++) {
					System.out.print(num[i] + " ");
				}
			}
		}
		if(found == false) { //一致しなかった場合表示させる
			System.out.println("見つかりませんでした");
		}
		System.out.println("\nプログラムを終了します");
	}

//数字入力値メソッド
	public static int input() {

		while (true) {
			try {
				int num = new java.util.Scanner(System.in).nextInt();
				return num;
			} catch (Exception e) {
				System.out.println("数字以外が入力されました\n入力しなおしてください");
			}
		}
	}
}
