package application.service.acount.open_acount;

import java.util.Objects;
import java.util.Random;

import domain.entity.Acount;
import domain.exception.OpenaAcountException;
import domain.service.AcountManagementService;

public class OpenAcount {

    /**
     * 口座を開設する.
     * @param name 登録氏名
     * @param pass 登録パスワード
     */
    public void openAcount(String sureName,String name,String pass,int initiPrice){
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
        // ※登録用機能を先に実装
        
        // 登録済みでなければ、外部ファイルへ書き出す
            Acount acount = new Acount(sureName,name,pass);
            String acountNumber = this.setAcountNumber();
            if(Objects.isNull(acountNumber)){
                throw new OpenaAcountException();
            }
        }
    }

    private String setAcountNumber() {
        int[] acountNumber = new int[8];
        for(int i=0; i<acountNumber.length; i++){
            acountNumber[i] = getRandomNumber();
        }
        return this.getAcountNumber(acountNumber);
    }

    private int getRandomNumber(){
        Random random = new Random();
        return random.nextInt(10);
    }

    private String getAcountNumber(int[] acountNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int a : acountNumber){
            stringBuilder.append(a);
        }
        return stringBuilder.toString();
    }
}
