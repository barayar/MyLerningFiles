class Err {
    String msg;
    int severity;

    public Err(String m, int s) {
        msg = m;
        severity = s;
    }
}

class ErrorInfo {
    String msgs[] = {
            "Output error",
            "Input error",
            "No disc space",
            " "    };
    int    howbad[] = {3, 3, 2, 4};

    Err getErrorInfo(int i) {
        if (i >= 0 & i < msgs.length)
            return new Err(msgs[i], howbad[i]);
        else
            return new Err("Non-existent error code", 0);
    }
}

public class ErrInfo {
    public static void main(String[] args) {
        ErrorInfo err1 = new ErrorInfo();
        Err e;

        e = err1.getErrorInfo(2);
        System.out.println(e.msg + " level : " + e.severity);

        e = err1.getErrorInfo(19);
        System.out.println(e.msg + " level : " + e.severity);
    }
}
