class Farm 
{     
   private Animal[] aBunchOfAnimals=new Animal[3];
   public Farm(){

   	aBunchOfAnimals[0]= new NamedCow("cows","Elsie","moo");
   	aBunchOfAnimals[1]= new Chick("chicks","cheep","cluck");
   	aBunchOfAnimals[2]= new Pig("pigs","oink");
   }

   public void animalSounds(){

   		for(int i=0;i<aBunchOfAnimals.length;i++){

   			System.out.println(aBunchOfAnimals[i].getType()+" goes " + aBunchOfAnimals[i].getSound());
   		}

   		System.out.println("The cow's name is " +((NamedCow)aBunchOfAnimals[0]).getName());
   	}
}
