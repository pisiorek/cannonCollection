public class Cannon {

    public boolean loaded = false;

    public  Cannon(boolean loaded){
        this.loaded = loaded;
    }
    public boolean getStateCannon(){
        return  loaded;
    }
    public void fire(){

        if(getStateCannon() != true){

            System.out.println("Armata nie jest załadowana");
            //załadowanie armaty
            this.loaded = true;
            System.out.println("Załadowano i teraz możemy strzelać. Buuuuuum !!!!! \n");

        }else{

            System.out.println("Ognia ! Buuuuuuum !!!!! \n");

        }

    }
}
