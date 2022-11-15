public class DrillingMachine {

    private int watt;
    private String name;
    private int age;
    private double price;
    private boolean broken;

    public DrillingMachine(){
        name = "Super DM 5001";
        watt = (int)(Math.random()*1201 + 800);
        age = (int)(Math.random()*11);
        price = (Math.random()*450 + 50);
        broken = false;
    }
    public void showInfos(){
        System.out.println(name + "" + "Watt:" + getWatt() + "- Preis" + getPrice() + "" + "kaputt?" + isBroken());
    }

    public String getName() {
        return name;
    }

    public int getWatt() {
        return watt;
    }

    public void setWatt(int watt) {
        this.watt = watt;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }
    public boolean isInexpensive(){
        if(getWatt() > 500 && getPrice() < 80){
            return true;
        }else{
            return false;
        }
    }
    public double getPricePerWatt(){
        return getWatt() / getPrice();
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isBroken() {
        return broken;
    }

    public void becomeBroken() {
        broken = true;
    }
    public void repair() {
        if(isBroken()){
            broken = false;
            setPrice(getPrice()/2);
        }
    }
    public void aging(){
        setAge(getAge()+1);
        if(getAge() >= 10){
            setBroken(true);
        }
    }
    public void reactOnHighDemand(){
        setPrice(getPrice()*1.25);
    }
    public void setBroken(boolean isBroken){
        this.broken = broken;
    }
    public void increasePrice(double amount){
        setPrice(getPrice() + amount);
    }
    public void changePower(int watt){
        if(this.watt > 0) {
            setWatt(getWatt() + this.watt);
            if (this.watt > 100) {
                setPrice(getPrice() * 1.05);
            }else if(this.watt < 0){
                setWatt(getWatt() + this.watt);
                setPrice(getPrice()*0.9);
            }
        }
    }
    public void changePowerButBetter(int watt) {
        if (this.watt > 100) {
            setPrice(getPrice() * 1.05);
        } else if (this.watt < 0) {
            setPrice(getPrice() * 0.9);
        }
        if (this.watt != 0) {
            setWatt(getWatt() + this.watt);
        }
    }
    public boolean increasePriceByPercentage(double percentage) {
        if (percentage > 0.0) {
            setPrice(getPrice() * (1 + percentage));
        }
        if (getPrice() > 100) {
            return true;
        } else {
            return false;
        }
    }
    public boolean repair2(){
        if(isBroken()){
            setBroken(broken = false);
            return true;
        }else{
            return false;
        }
    }
    public String getInfo(){
        return "Ich bin" + name + "und bin" + age + "jahre alt." + "Meine Leistung ist:" + watt + "und ich koste:" + price;
    }
}
