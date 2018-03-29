package adapter_pattern;

/**
 * @author zhengzechao
 * @date 2018/3/26
 *
 *
 * 适配器
 */

public class OutputAdapter extends LowOutPutObject implements HighOutput{




    @Override
    public void workInHigh() {
        super.workInLow();

    }
}
