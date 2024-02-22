class JavaSingletonPattern {

    private static JavaSingletonPattern singletonStance;
    public String str;
    private JavaSingletonPattern(){
    }

    public static synchronized JavaSingletonPattern getSingleInstance()
    {
        if (singletonStance == null){
            singletonStance = new JavaSingletonPattern();
        }
        return singletonStance;
    }
}
