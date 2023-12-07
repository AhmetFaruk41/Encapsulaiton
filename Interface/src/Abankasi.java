public class Abankasi implements IBanka {
    private  String bankaAdi;
    private String terminalId;
    private String password;

    public Abankasi(String bankaAdi,String terminalId,String password){
     this.bankaAdi=bankaAdi;
     this.terminalId =terminalId;
     this.password=password;
    }
    public boolean connect(String ipAdress){
        System.out.println("Kullanıcı ip : "+ ipAdress);
        System.out.println("Makina ip: "+this.hostIpAdress);
        System.out.println(this.bankaAdi+ " bağlanıldı!");
        return true;
    }
    public boolean payment(double price, String cardNumber, String date, String cvc){
        // Banka ödeme işlemleri
        System.out.println("Bankadan cevap bekleniyor...");
        System.out.println("İşlem başarılı oldu!");
        return  true;
    }
    public String getBankaAdi(){
        return this.bankaAdi;
    }
    public void setBankaAdi(String bankaAdi){
        this.bankaAdi=bankaAdi;
    }
    public String getTerminalId(){
        return this.terminalId;
    }
    public void setTerminalId(String terminalId){
        this.terminalId = terminalId;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password=password;
    }


}
