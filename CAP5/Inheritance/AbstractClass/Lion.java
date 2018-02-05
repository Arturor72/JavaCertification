public class Lion extends BigCat{
	public String getName(){
		return "Lion";
	
	}
	public void roar(){
		System.out.println("The lion lets out a loud ROAR!!");
	}

        public static void main(String...args){
            Lion lion=new Lion();
            System.out.println(lion.getName());
            lion.roar();
        }


}
