

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.core.annotation.Order;

public class Cart {
	private List<Order> orderList;

	public Cart(List<Order> orderList) {
        this.orderList = orderList;
    }

	/**
	 * 商品リストを取得する
	 * @return 商品リスト（書き込み不可）
	 */
	public List<Order> getOrderList() {
		return orderList;
	}

	/**
    * 商品をカートに入れる
    * @param order カートに入れる商品
    */
   public void addIntoMyCart(Order order) {
       Cart cart = new cart;
       cart.add(order);
   }

   /**
    * ユーザの現在のカートの合計金額を求める
    * @return カートの合計金額
    */
   public int getPrice(Cart cart) {
       Cart cart = new cart;
       int total = 0;
       for (Order order : cart) {
           total += order.getPrice();
       }

       return total;
   }

}
