package application.service.acount.open_acount;

public class OpenAcount {

    /**
     * 口座を開設する.
     * @param name 登録氏名
     * @param pass 登録パスワード
     */
    public void openAcount(String sureName,String name,String pass,double initiPrice){
        // 正規表現(name)
        final String nameValidate = "[A-Z]{1}[a-z]*";
        // 正規表現(pass)
        final String passValidate = "[0-9]{4}";
        // nameの正規表現でチェックする
        // 　口座名は、ローマ字、英字で作成される
        final boolean isSureName = sureName.matches(nameValidate);
        final boolean isName = name.matches(nameValidate);
        // passを正規表現でチェックする
        final boolean isPass = pass.matches(passValidate);
        if (isSureName && isName && isPass) {
        // 登録済み口座でないかチェックする※外部ファイルからインポート(インポート用クラスを用意)
        //      データを呼び出すため、domain側serviceを使用して呼び出す
        
        // 登録済みでなければ、外部ファイルへ書き出す
        }
    }
}
