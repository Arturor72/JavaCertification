public class Mouse extends Rodent{
    // No se sobreescriben las variables, en este caso se llama igual
    // y tiene el mismo modificador de acceso pero la oculta. La instancia 
    // del padre siempre llamara a su variable interna
    protected int tailLength=8;
    public void getMouseDetails(){
        System.out.println("[tail="+tailLength+", parentTail="+super.tailLength+"]");

    }

    public static void main(String[] args){
        Mouse mouse=new Mouse();
        mouse.getRodentDetails();
        mouse.getMouseDetails();
    
    }

}
