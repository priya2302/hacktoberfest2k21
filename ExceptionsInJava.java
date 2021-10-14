
import java.util.ArrayList;
import java.util.List;

public class ExceptionsInJava {
    static class InterruptingThread extends Thread{
        public void run() {
            try {
                Thread.sleep(1000);
                System.out.println("Executing");
            } catch (InterruptedException e) {
                System.out.println("Execution failed, InterruptedException caught");
            }
            finally {
                System.out.println("Finally , Execution completed,method ends.");
                System.out.println("----------------------------------------------------------------------------");
            }
        }
        
    }
    static class ArrayOutOfBounds {
        public void array() {
            String[] arr = {"S", "H" ,"I", "B", "A" };
            try {
                for (int i = 0; i <= arr.length; i++) {
                    System.out.println(arr[i]);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Access to elements out of array size failed, ArrayIndexOutOfBoundsException caught");
            }
            finally {
                System.out.println("Finally , Array elements displayed, method ends.");
                System.out.println("------------------------------------------------------------------------------");
            }
        }
    }
    static class IllegalArgument {
        public void setMarks(int marks) {
            try {
                if (marks < 0 || marks > 100)
                    throw new IllegalArgumentException();
                System.out.println(marks);
            } catch (IllegalArgumentException e) {
                System.out.println("Value exceeded,  IllegalArgumentException caught");
            }
            finally {
                System.out.println("Finally, Values printed within the range given, method ends");
                System.out.println("-----------------------------------------------------------------------------");
            }
        }
    }
    static class IndexOutOfBounds {
        public void string() {
            List<String> l = new ArrayList<>();
            l.add("V");
            l.add("M");
            try {
                for (int i = 0; i <= l.size(); i++) {
                    System.out.println(l.get(i));
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Access to elements out of list size failed, IndexOutOfBoundsException caught");
            }
            finally {
                System.out.println("Finally , String elements displayed, method ends");
                System.out.println("-------------------------------------------------------------------------------");
            }
        }
    }
    static class NegativeArraySize {
        void createArray(int size) {
            try {
                int[] arr = new int[size];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = i;
                    System.out.println(arr[i]);
                }
            } catch (NegativeArraySizeException e) {
                System.out.println("Access to negative index of array size given failed , NegativeArraySizeException caught");
            }
            finally {
                System.out.println("Finally, Array elements displayed within the range given, method ends");
                System.out.println("-------------------------------------------------------------------------------");
            }
        }
    }
    static class NullPointer {
        void displayString(String str) {
            try {
                System.out.println("First character of string is " + str.charAt(0));
            } catch (NullPointerException e) {
                System.out.println("Null as argument passed, NullPointerException caught ");
            }
            finally {
                System.out.println("Finally, First character displayed if argument isn't null, method ends");
                System.out.println("-----------------------------------------------------------------------------");
            }
        }
    }

    public static void main(String[] args) {
        InterruptingThread interruptingThread = new InterruptingThread();
        interruptingThread.start();
        interruptingThread.interrupt();
        ArrayOutOfBounds arrayOutOfBounds = new ArrayOutOfBounds();
        arrayOutOfBounds.array();
        IllegalArgument illegalArgument = new IllegalArgument();
        illegalArgument.setMarks(105);
        IndexOutOfBounds indexOutOfBounds = new IndexOutOfBounds();
        indexOutOfBounds.string();
        NegativeArraySize negativeArraySize = new NegativeArraySize();
        negativeArraySize.createArray(-1);
        NullPointer nullPointer = new NullPointer();
        nullPointer.displayString(null);
    }
}

