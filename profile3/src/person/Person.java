package person;

import java.text.DecimalFormat;

public class Person {
	public static int count = 0;//インスタンスが作成された回数をカウントするクラス変数
	public String firstName;//姓を表す文字列
	public String lastName; //名を表す文字列
	public int age;//年齢を表す整数
	public double height, weight;//身長、体重を表す浮動小数点数
	
	// firstNameとlastNameを受け取るコンストラクタ
	 public Person(String firstName, String lastName, int age, double height, double weight){
        this.firstName = firstName;// firstName を設定
        this.lastName = lastName; // lastName を設定
        this.age = age;//ageを設定
        this.height = height;//heightを設定
        this.weight = weight;//weightを設定
        count++;
    }
	
	// lastNameのみを受け取るコンストラクタ
	 public Person(String firstName, int age, double height, double weight, String lastName){
        this.firstName = firstName;
        this.lastName = lastName; // lastNameの値をセット
        this.age = age;
        this.height = height;
        this.weight = weight;
        count++;
    }

	
	//姓と名を連結してフルネームを返すメソッド
	public String fullName(){
        if (this.firstName != null && this.lastName != null) {
            return this.firstName + " " + this.lastName; // スペースで連結
        } else {
            return "名前未設定";//nullの場合は"名前未設定"
        }
    }
	//年齢、BMIを表示するメソッド
		public void print(){
	        if (this.firstName != null && this.lastName != null) {
	            System.out.println("名前は" + this.fullName() + "です");
	            System.out.println("年は" + this.age + "です");
	            DecimalFormat df = new DecimalFormat("#.#");
	            double bmi = this.bmi();
	            System.out.println("BMIは" + df.format(bmi) + "です");
	        } else {
	            System.out.println("エラー：名前が未設定です。");//名前が未設定の場合は"エラー：名前が未設定です"を表示
	        }
	    }
	//BMIを計算して小数第一位まで返すメソッド
    public double bmi(){
        return Math.floor(this.weight / (this.height * this.height) * 10) / 10.0; // BMIを小数点第一位まで計算
    }
    //インスタンスの総数を表示するメソッド
	public static void printCount(){
	System.out.println("合計" + Person.count + "人です");
	}
}