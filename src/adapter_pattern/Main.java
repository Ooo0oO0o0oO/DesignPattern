package adapter_pattern;

/**
 * @author zhengzechao
 * @date 2018/3/26
 */



public class Main {
    public static void main(String[] args) {

        HighOutput o = new HighOutPutObject();
        work(o);

        HighOutput o1 = new OutputAdapter();
        work(o1);
    }


    public static void work(HighOutput highOutput) {
        highOutput.workInHigh();

    }
}
