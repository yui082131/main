package sample;

public class sample {

	public static void main(String[] args) {
		     /*1 下記9個をローカル変数として宣言のみ行う
		       ・バイト型・短整数型・整数型・長整数型
		       ・単精度浮動小数点数型・倍精度浮動小数点数型
		       ・文字型・文字列型
		       ・ブーリアン型*/
		        
				// バイト型の宣言のみ。
				byte b;
				
				// 短整数型の宣言のみ。
				short sh;
				
				// 整数型の宣言のみ。
				int i;
				
				// 長整数型の宣言のみ。
				long l;
				
				// 単精度浮動小数点数型の宣言のみ。
				float f;
				
				// 倍精度浮動小数点数型の宣言のみ。
				double d;
				
				// 文字型の宣言のみ。
				char c;
				
				// 文字列型の宣言のみ。
				String s;
				
				// ブーリアン型の宣言のみ。
				boolean bo;
				
				String If = System.lineSeparator();
				System.out.println(If);
			//2　1のそれぞれのローカル変数をローカル内でそれぞれの初期値を代入して初期化する
				// バイト型の初期値を代入して初期化
				b = 0;
				
				// 短整数型の初期値を代入して初期化
				sh = 0;
				
				// 整数型の初期値を代入して初期化
				i = 0;
				
				// 長整数型の初期値を代入して初期化
				l =0L;
				
				// 単精度浮動小数点数型の初期値を代入して初期化
				f =0.0f;
				
				// 倍精度浮動小数点数型の初期値を代入して初期化
				d = 0.0d;
				
				// 文字型の初期値を代入して初期化
				c = '\u0000';
				
				// 文字列型の初期値を代入して初期化
				s = null;
				
				// ブーリアン型の初期値を代入して初期化
				bo = false;
			    // 改行処理
				System.out.println(If);
			/*3 初期化をしたそれぞれの変数に下記の値を代入する		
				・バイト型		10
				・短整数型		100
				・整数型		1000
				・長整数型		10000
				・単精度浮動小数点数型		9.5
				・倍精度浮動小数点数型		10.5
				・文字型		a
				・文字列型		ハロー
				・ブーリアン型		true*/
				
				// バイト型を初期化
				b = 0;
				// バイト型に10を代入
				b = 10;
				
				// 短整数型を初期化
				sh = 0;
				// 短整数型に100を代入
				sh = 100;
				
				// 整数型を初期化
				i = 0;
				// 整数型に1000を代入
				i = 1000;
				
				// 長整数型を初期化
				l =0L;
				// 長整数型に10000を10000を代入
				l = 10000;
				
				// 単精度浮動小数点数型を初期化
				f =0.0f;
				// 単精度浮動小数点数型に9.5を代入
				f = 9.5F;
				
				// 倍精度浮動小数点数型を初期化
				d = 0.0d;
				// 倍精度浮動小数点数型に10.5を代入
				d = 10.5;
				
				// 文字型を初期化
				c = '\u0000';
				// 文字型にaを代入
				c = 'a';
				
				// 文字列型を初期化
				s = null;
				// 文字列型にハローを代入
				s = "ハロー";
				
				// ブーリアン型を初期化
				bo = false;
				// ブーリアン型にtrueを代入
				bo = true;
				// 改行処理
				System.out.println(If);
			/*4 下記の通りにコンソール出力されるようにする
                3で作成した変数を必ず使用する
                11110
                20
                a ハロー true
                11130
                10000000000
                0.105
                -90*/
				
			    //バイト型、短整数型、整数型、長整数型を全て足して、11110を出力する。
				b = 10;                         
				sh = 100;                       
				i = 1000;                         
				l = 10000;
				// 全て足した値を出力
				System.out.println(b + sh + i + l);
				
				//単精度浮動小数点数型と倍精度浮動小数点数型を足して20を出力する。
				f =9.5F;
				d =10.5D;
				// 全て足した値を出力
				System.out.println(Math.round(f + d)); 
				
				//文字型と文字列型とブーリアン型を結合して出力する。
				c = 'a';
				s = "ハロー";
				bo = true;
				String Qes1_13 = c + s + bo;
				// 全て足した値を出力
				System.out.println(Qes1_13); 
				
				//バイト型、短整数型、整数型、長整数型、単精度浮動小数点数型、倍精度浮動小数点数型を全て足して出力する。
				b = 10;                         
				sh = 100;                       
				i = 1000;                         
				l = 10000; 
				f =9.5F;
				d =10.5D;
				// 全て足した値を出力
				System.out.println(Math.round(b + sh + i + l + f + d)); 
				
				//バイト型、短整数型、整数型、長整数型をかけて出力する。
				b = 10;                         
				sh = 100;                       
			    i = 1000;                         
				l = 10000; 
				// 全てかけた値を出力
				System.out.println(b * sh * i * l); 
				
				//10.5割る100をして出力する。
				sh = 100;                       
				d =10.5D;
				// 割った値を出力
				System.out.println(d / sh); 
				
				//10引く100をして出力する。
				b = 10;  
				sh = 100;  
				// 引いた値を出力
				System.out.println(b - sh); 
				// 改行処理
				System.out.println(If);
				
			/*5 次のプログラムを実行すると「ハローJAVA2023」という結果が表示される。
			   「ハローJAVA43」と表示するため、正しく動作するように修正する。
				String num="20";
				int num1=23;
				System.out.println("ハローJAVA"+(num+num1));*/
				
				// 整数型で宣言する。
				int num= 20;
				int num1=23;
				// 結果を出力
				System.out.println("ハローJAVA"+(num+num1));
				// 改行処理
				System.out.println(If);
				
			/*6『』で囲われた人の情報を変数にして、formatの通りコンソールに出力する。
				ローカル変数に代入し○○に入れる。
				『山田太郎 18歳 170.5cm 62.2kg 寿司』
				↓↓format↓↓
　　　　　　　    「初めまして○○です」
               「年齢は○○歳です」
               「身長は○○cmです」
               「体重は○○kgです」
               「好きな食べ物は○○です」*/
				
				// 変数に山田太郎を代入
				s= "山田太郎";
				System.out.println("「"+ "初めまして"+ s +"です" + "」");
				
				// 変数に18を代入
				i =18;			
				System.out.println("「"+ "年齢は"+ i +"歳です" + "」");
				
				// 変数に170.5を代入
				f = 170.5F;
				System.out.println("「"+ "身長は"+ f +"cmです" + "」");
				
				// 変数に62.2を代入
				f = 62.2F;
				System.out.println("「"+ "体重は"+ f +"kgです" + "」");
				
				// 変数に寿司を代入
				s = "寿司";
				// 結果を出力
				System.out.println("「"+ "好きな食べ物は"+ s +"です" + "」");
				// 改行処理
				System.out.println(If);
				
			/*7 6で作成した自己紹介を元に、BMIを出力する。
				「BMIは○○です」
				ただし計算は数値を直書きせず、全て変数を使ってする*/
				
				// BMIの出力に必要な変数を宣言する
				f = 170.5F;
				d = 62.2F;
				sh = 100;
				// 結果を出力
				System.out.println("「"+ "BMIは"+(String.format("%.1f",(d / ((f / sh) * (f / sh))))+"です" +"」"));
				// 改行処理
				System.out.println(If);
				
			/*8 6で宣言した変数に再代入し下記の通りコンソールに出力する。
				初めまして鈴木一郎です
				年齢は24歳です
				身長168.5cmです
				体重は64.2kgです
				好きな食べ物はオムライスです
				BMIは22.6です*/
				
				// 鈴木一郎を変数aに再代入する。
				String a = "山田太郎";
				a = "鈴木一郎";
				// 結果を出力
				System.out.println("初めまして"+ a +"です");
				
				// 24を変数iに再代入する。
				i = 18;
				i = 24;
				// 結果を出力
				System.out.println("年齢は"+ i +"歳です");
				
				// 168.5を変数fに再代入する。
				f = 170.5F;
				f = 168.5F;
				// 結果を出力
				System.out.println("身長は"+ f +"cmです");
				
				// 64.2を変数dに再代入する。
				d = 62.2;
				d = 64.2;
				// 結果を出力
				System.out.println("体重は"+ d +"kgです");
				
				// オムライスを変数sに再代入する。
				s = "寿司";
				s = "オムライス";
				// 結果を出力
				System.out.println("好きな食べ物は"+ s +"です");
				
				// BMIを出力
				sh = 100;
			    System.out.println("BMIは"+(String.format("%.1f",(d / ((f / sh) * (f / sh))))+"です"));
			    // 改行処理
			    System.out.println(If);
			    
		    /*9 8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
			    初めまして鈴木一郎です
			    年齢は48歳です
			    身長337.0cmです
			    体重は128.4kgです
			    好きな食べ物はオムライスです
			    BMIは11.31です*/
		        
			    // 変数aに鈴木一郎を宣言する
		        a = "鈴木一郎";
		        // 結果を出力
		        System.out.println("初めまして"+ a +"です");
		        
		        // 変数iに24を自己代入して出力する
		        i = 24;
		        System.out.println("年齢は"+ i*2 +"歳です");
		        
		        // 変数fに168.5を自己代入して出力する
		        f =168.5F;
		        System.out.println("身長は"+ f*2 +"cmです");
		        
		        // 変数dに64.2を自己代入して出力する
		        d =64.2;
		        System.out.println("体重は"+d*2 +"kgです");
		        
		        // 変数sにオムライスを宣言する
		        s ="オムライス";
		        // 結果を出力
		        System.out.println("好きな食べ物は" + s +"です");
		        
		        // BMIを出力
		        sh = 100;
			    System.out.println("BMIは"+(String.format("%.2f",(d / ((f / sh) * (f / sh)))/2)+"です"));
			    // 改行処理
			    System.out.println(If);
			    
		    //10 8で使用した年齢が25歳以上ならtrueが出力されるようにする。
		
			    // 変数iに18を宣言する
		        i = 18;
		        // 24を再代入する
		        i = 24;
		        // 結果を出力
		        System.out.println("年齢は"+ i +"歳です");
		        // 25歳以上ならtrueが出力されるようにする
		        System.out.println(i >=25);
		        // 改行処理
		        System.out.println(If);
		        
		    //11 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力する。
		
		        // 変数iに18を宣言する
		        i = 18;
		        // 24を再代入する
		        i = 24;
		        // 文字列型に変換する
		        String str =String.valueOf(i);
		        // 結果を出力
		        System.out.println("年齢は"+ str +"歳です");
		        
		        // 変数fに170.5を宣言する
		        f = 170.5F;
		        // 168.5を再代入する
			    f = 168.5F;
				// 文字列型に変換する
				String str1 =String.valueOf(f);
				// 結果を出力
				System.out.println("身長は"+ str1 +"cmです");
				
				// 変数dに62.2を宣言する
				d = 62.2;
				// 64.2を再代入する
				d = 64.2;
				// 文字列型に型変換する
				String str2 =String.valueOf(d);
				// 結果を出力
				System.out.println("体重は"+ str2 +"kgです");
				
				// 年齢、身長、体重を繋げて出力
				System.out.println(str + str1 + str2);
				// 改行処理
				System.out.println(If);
				
	        //12 11で変換した【年齢・身長】を整数型に変換して出力する。
				
				// 変数strに24を宣言
				str ="24";
				// 整数型に変換
				i =Integer.parseInt(str);
				// 結果を出力
				System.out.println("年齢は"+ i +"歳です");
				
				// 変数str1に168.5を宣言
				str1 ="168.5";
				// 整数型に変換
				d =Double.parseDouble(str1);
				// 結果を出力
				System.out.println("身長は"+ d +"cmです");
				// 改行処理
				System.out.println(If);
				
	        //13 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力する。
		
				// 変数strに24を宣言
		        str ="24";
		        // 整数型に変換
		        i =Integer.parseInt(str);
		        // 結果を出力
		        System.out.println("年齢は"+ i +"歳です");
		        
		        // 変数str1に168.5を宣言
		        str1 ="168.5";
		        // 整数型に変換
		        d =Double.parseDouble(str1);
		        // 結果を出力
		        System.out.println("身長は"+ d +"cmです");
		        
		        // 年齢が25もしくは身長が160以上であればtrueを出力する
		        boolean result;
		        result = (i ==25) || (d >=160);
		        System.out.println(result); 
		        //改行処理
		        System.out.println(If);
		        
	}

}
