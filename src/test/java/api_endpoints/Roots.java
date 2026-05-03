package api_endpoints;

public class Roots {
    public static String Base_Url="https://petstore.swagger.io/v2";

    // We will be using all of them for user model.
    public static String Post_User_Url=Base_Url+"/user";
    public static String Get_User_Url=Base_Url+"/user/{username}";
    public static String Update_User_Url=Base_Url+"/user/{username}";
    public static String Delete_User_Url=Base_Url+"/user/{username}";

    // We will be creating all of them for store module
  public static String Post_Pet_Url=Base_Url+"/v2/pet";
  public static String Get_Pet_Url=Base_Url+"/pet/{petId}";
  public static String Update_Pet_Url=Base_Url+"/pet/{petId}";
  public static String Delete_Pet_Url=Base_Url+"/pet/{petId}";

    // We will be creating all of them for store module
    public static String Post_Store_Url=Base_Url+"/store/order";
    public static String Get_Store_Url=Base_Url+"/store/order/{orderId}";
    public static String Delete_Store_Url=Base_Url+"/store/order/{orderId}";

}
