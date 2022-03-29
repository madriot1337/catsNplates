public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(80);
        Cat[] catsArr = new Cat[3];
        catsArr[0] = new Cat("Barsik", 30);
        catsArr[1] = new Cat("Mars", 50);
        catsArr[2] = new Cat("Murzik", 20);

        for (int i = 0; i < catsArr.length; i++) {
            plate.Info();
            catsArr[i].Eating(plate);
            catsArr[i].satietyCheck();
            plate.addFood(10);



        }



    }
}
