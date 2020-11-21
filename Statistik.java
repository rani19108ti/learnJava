public class Statistik
{
    int size = 0;
    double[] tScore; // no need to create it here, it's already created and filled in outside
    double sum = 0;

    public Statistik(double[] scores ,int sizE)
    {
        this.tScore = scores; // "this." added for clarity
        this.size = sizE; // "this." added for clarity
    }

    public double avgGrade()
    {
        for(int count = 0; count < tScore.length ; count++) 
        {
            sum = tScore[count] + sum;
        }
    double avg = sum / size;
    return avg;
    }

    public double calcMedian(double[] m) 
    {
        int middle = m.length/2;
        if (m.length%2 == 1) {
            return m[middle];
        } else {
            return (m[middle-1] + m[middle]) / 2.0;
        }
    }

    public int[] bikinInt(double[] array2) 
    {
        int[] arr = new int[array2.length];
        System.out.print("Data yang diinput adalah : ");
        for (int i = 0; i < array2.length; i++) {
            arr[i] = (int) Math.ceil(array2[i]);
            System.out.print((arr[i])+ " ");
        }
        return arr;
    }
    
    public int mode(int a[]) 
    {
    int maxValue = 0, maxCount=0;

        for (int i = 0; i < a.length; ++i) 
        {
            int count = 0;
            for (int j = 0; j < a.length; ++j) {
                if (a[j] == a[i]) ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = a[i];
            }
        }
        return maxValue;
        
    }
}