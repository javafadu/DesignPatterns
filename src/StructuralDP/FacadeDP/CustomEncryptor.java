package StructuralDP.FacadeDP;

public class CustomEncryptor {
    public static void main(String[] args) {

        String text = "Content";

        // basic way
        AESEncryptor aesEncryptor = new AESEncryptor();
        aesEncryptor.encrypt(text);

        MD5Encryptor md5Encryptor = new MD5Encryptor();
        md5Encryptor.encrypt(text,"KEY");

        SHAEncryptor shaEncryptor = new SHAEncryptor();
        shaEncryptor.encrypt(text,"KEY",true);
        // end of basic way


        // facadeDP advance way
        EncryptorFacade encryptorFacade = new EncryptorFacade();
        encryptorFacade.encrypt(text,EncryptorFacade.EncType.MD5);


    }
}
