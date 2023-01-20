import static java.sql.Types.NULL;

public class Generic {
    private static int[] mas;
    static int size = 10;

    Generic(){
        mas = new int[size];
        for (int i = 0; i < size; i++){
            mas[i] = NULL;
        }
    }

    public void Add(int num) throws MyExt{
        int i = 0;

        try{
            while (mas[i] != NULL){
                i++;
                if (i>=size) throw new MyExt();
            }
            mas[i] = num;
        }catch(MyExt e){
            System.out.println(e.ErrorAdd());
        }
    }

    public void Delete(int num) throws MyExt{
        int i = 0;
        int cout = 0;

        try{
            while (mas[i]==NULL||mas[i]!=num){
                i++;
                if (i >= size) throw new MyExt();



                if (i < size) {
                    if (mas[i]!=NULL && mas[i]!=num) cout++;
                }

            }
            if (mas[i]==num) mas[i] = NULL;
        }catch (MyExt e){
            if (cout>0){
                System.out.println(e.ErrorDeleteNum());
            }
            else System.out.println(e.ErrorDelete());
        }
    }

    public int Multi() throws MyExt{
        int res = 1;

        try
        {
            for (int i = 0; i < size; i++)
            {
                    if (mas[i] == 0) throw new MyExt();
                    else res = res * mas[i];
            }
            return res;
        }catch (MyExt e){
            System.out.println(e.ErrorMethod());
            return 0;
        }
    }

    public void Print(){
        for (int i = 0; i < size; i++){
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }
}
