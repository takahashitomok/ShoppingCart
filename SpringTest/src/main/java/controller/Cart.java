package controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.core.annotation.Order;

public class Cart {
	private List<Order> orderList;
	private HashMap<User,Cart> cartMap;

	public Cart(List<Order> orderList) {
        cartMap = new HashMap<>();
        this.orderList = orderList;
    }

	/**
	 * 商品リストを取得する
	 * @return 商品リスト（書き込み不可）
	 */
	public List<Order> getOrderList() {
		return Collections.unmodifiableList(orderList);
	}

	/**
    * 商品をカートに入れる
    * @param user カートに入れるユーザ
    * @param order カートに入れる商品
    */
   public void addIntoMyCart(User user, Order order) {
       Cart myCart = cartMap.get(user);
       myCart.add(order);
   }

   /**
    * ユーザの現在のカートの合計金額を求める
    * @param user 求めたいユーザ
    * @return カートの合計金額
    */
   public int getTotalPrice(User user) {
       Cart myCart = cartMap.get(user);
       int total = 0;
       for (Order order : myCart) {
           total += order.getPrice();
       }

       return total;
   }

}
