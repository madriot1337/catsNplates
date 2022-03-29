public class Plate {
    int foodQuantity;




    public Plate(int foodQuantity){
        this.foodQuantity = foodQuantity;
    }

    public void decreaseFood(int n){
        if(foodQuantity < n ) {
            System.out.println("Cat cannot eat");
        } else {
            this.foodQuantity -= n;

        }

    }

    public void Info(){
        System.out.println("В тарелке осталось: " + foodQuantity);
    }


    public void addFood(int n){
        this.foodQuantity += n;
        System.out.println("В тарелку добавлено " + n + " едениц еды.");
    }


}
