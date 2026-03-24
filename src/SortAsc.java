class SortAsc{
   public static void main(String[] args) {
        List<Integer> list=Arrays.asList(2,1,7,4,22,11);
        sort(list); 
    }
    public static void sort(List<Integer> list){
        list.stream().sorted((e1,e2)->e1.compareTo(e2)).collect(Collectors.toList())
        .stream().forEach(e->System.out.println(e));
    }
}

