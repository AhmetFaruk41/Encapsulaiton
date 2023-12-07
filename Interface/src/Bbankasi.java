public class Bbankasi implements IBanka {
    private  String bankaAdi;
    private String terminalId;
    private String password;


    public Bbankasi(String bankaAdi,String terminalId,String password) {
        this.bankaAdi=bankaAdi;
        this.terminalId =terminalId;
        this.password=password;
    }
    public void connect(){
        System.out.println(this.bankaAdi+ " bağlanıldı!");
    }

    @Override
    public boolean connect(String ipAdress) {
        return false;
    }

    public boolean payment(double price, String cardNumber, String date, String cvc){
        // Banka ödeme işlemleri
        System.out.println("Bankadan cevap bekleniyor...");
        System.out.println("İşlem başarılı oldu!");
        return  true;
    }



    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
