package Week1.DataStructuresAndAlgorithms.EcommercePlatformSearchFunction;

public class Main {
    public static Product linearSearch(Product[] products, int targetId) {
        for(Product p : products) {

            if(p.getProductId() == targetId) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int targetId){
        int left = 0;
        int right = products.length - 1;
        
        while(left <= right){
            int mid = (left + right)/2;
            int id = products[mid].getProductId();
            
            if(targetId == id){
                return products[mid];
            }
            if(targetId > id){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Product[] products = {

            new Product(101,"Laptop","Electronics"),
            new Product(102,"Phone","Electronics"),
            new Product(103,"Mouse","Accessories"),
            new Product(104,"Keyboard","Accessories"),
            new Product(105,"Monitor","Electronics")
        };

        Product result1 = linearSearch(products,104);
        System.out.println("Linear Search : " + result1.getProductName());

        Product result2 = binarySearch(products,104);
        System.out.println("Binary Search : " + result2.getProductName());
    }
}