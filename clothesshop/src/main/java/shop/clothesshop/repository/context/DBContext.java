package shop.clothesshop.repository.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.clothesshop.repository.*;

@Service
public class DBContext {
    @Autowired
    public AccountRepo accountRepo;
    @Autowired
    public AccountStatusRepo accountStatusRepo;
    @Autowired
    public AccountBagRepo accountBagRepo;
    @Autowired
    public AccountShipContactRepo accountShipContactRepo;
    @Autowired
    public BuyMethodRepo buyMethodRepo;
    @Autowired
    public ProductRepo productRepo;
    @Autowired
    public RoleRepo roleRepo;
    @Autowired
    public SalesRepo salesRepo;
    @Autowired
    public ShipMethodRepo shipMethodRepo;
    @Autowired
    public BillRepo billRepo;
    @Autowired
    public BillDetailRepo billDetailRepo;
    @Autowired
    public BillSalesRepo billSalesRepo;
}
