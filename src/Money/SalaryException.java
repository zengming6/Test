package Money;

// SalaryException 类继承 BaseException
public class SalaryException extends BaseException {

    // 默认构造方法
    public SalaryException() {
        super("Salary related error occurred");
    }

    // 带消息的构造方法
    public SalaryException(String message) {
        super(message);
    }

    // 带消息和原因的构造方法
    public SalaryException(String message, Throwable cause) {
        super(message, cause);
    }

    // 带原因的构造方法
    public SalaryException(Throwable cause) {
        super(cause);
    }
}
