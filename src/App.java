public class App {
    public static void main(String[] args) {
        // ■ 簡易APPを作成
        // ■ ATMを模したPGを作成
        // ■ ATMに必要な機能
        // ・口座開設機能（登録）＝仕掛中
        // ・貯金、引出機能
        // ・明細機能（Excel）
        // ■ ATMのフローを作成
        // ・口座開設機能
        //      登録情報（氏名※正規表現でバリデ、パスワード※4桁、口座番号※自動生成、初期残高※開設時は0で初期化）
        //      登録情報は、DBにつながないためシリアライズで外部ファイルへ書き出す
        // ・貯金、引出機能の呼び出し
        //      指定金額の差し引きを行う
        // ・Excelに明細として出力する※項目などもPG制御で行う
        

        final String nameValidate = "[A-Z]{1}[a-z]*";
        final String testSureName = "Hoge";
        final String testName = "hoge";

        System.out.println(testSureName.matches(nameValidate));
        System.out.println(testName.matches(nameValidate));
    }
}
