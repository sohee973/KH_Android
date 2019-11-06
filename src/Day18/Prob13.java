package Day18;

class arithSequence{
    int series[];
    int num;

    public arithSequence(int first,int num){
        series=new int[num];
        series[0]=first;

        this.num=num;
    }
    public void calcArithSeq(){
        for(int i=1;i<num;i++){
            series[i]=series[i-1]+2;
        }
    }
    @Override
    public String toString(){
        return "series["+(num-1)+"] = "+series[num-1];
    }
}
public class Prob13 {
}
