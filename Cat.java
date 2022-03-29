public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite){
       this.name = name;
       this.appetite = appetite;
    }

    public void Eating(Plate p){
        if(p.foodQuantity >= appetite) {
            p.decreaseFood(appetite);
            System.out.println(name + " съел " + appetite);
            satiety = true;
        } else {
            System.out.println(name + " не сможет поесть");
            satiety = false;
        }

    }
    public void satietyCheck(){
        if (satiety == true){
            System.out.println(name + " сыт.");
        } else {
            System.out.println(name + " остался голоден.");

        }
    }

}
