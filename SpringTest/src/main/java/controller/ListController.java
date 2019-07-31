package controller;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import Cart;
import ListForm;

@Controller
public class ListController {

	@GetMapping("/List")
	public String show(@ModelAttribute("ListForm")ListForm listForm) {
		return toString();
	}

	@GetMapping("/List")
	public String order(@ModelAttribute("ListForm")ListForm listForm) {
		return toString();
	}

	 public static Cart getCart( RequestParameter req ) {
	    HttpSession session = req.getSession();
	    Cart    cart = (Cart)session.getAttribute( SESSION );
	    if ( cart != null ) return cart;
	    cart = new Cart();
	    session.setAttribute( SESSION, cart );
	    return cart;
}
}
/*
public class Cart {
	private List<Order> orderList;
	private HashMap<User,Cart> cartMap;

	public Cart(List<Order> orderList) {
        cartMap = new HashMap<>();
        this.orderList = orderList;
    }
}
	
	 * 商品リストを取得する
	 * @return 商品リスト（書き込み不可）

	public List<Order> getOrderList() {
		return Collections.unmodifiableList(orderList);
	}

    * 商品をカートに入れる
    * @param user カートに入れるユーザ
    * @param order カートに入れる商品
    *
   public void addIntoMyCart(User user, Order order) {
       Cart myCart = cartMap.get(user);
       myCart.add(order);
   }

    * ユーザの現在のカートの合計金額を求める
    * @param user 求めたいユーザ
    * @return カートの合計金額
    *
   public int getTotalPrice(User user) {
       Cart myCart = cartMap.get(user);
       int total = 0;
       for (Order order : myCart) {
           total += order.getPrice();
       }

       return total;
   }

}
*/
