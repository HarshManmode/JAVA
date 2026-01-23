class BufferStr
{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Navin");
        sb.append("Reddy");

        sb.insert(6,"java");
        sb.setLength(30);

        System.out.println(sb);
    }    
}