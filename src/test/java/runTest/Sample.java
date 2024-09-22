package runTest;



class StuDao{

    public void save(){
        System.out.println("Saving Student Data");
    }

}
public class Sample {
   public static void main(String[] args){
    StuDao stuDao = new StuDao();
    stuDao.save();
   }

   


}
