
package hello;


public class DuplicateNumber {
    
    int duplicate(int sup[])
    {
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
           if( sup[i]==sup[j])
              return sup[i];
            }
                       
        }
        return -1;
    }
    public static void main(String ar[])
    {
        int[] sup={1,2,3,2,4,3};
       
        DuplicateNumber d=new DuplicateNumber();
        int dup=d.duplicate(sup);
        System.out.println(dup);
    }
}
