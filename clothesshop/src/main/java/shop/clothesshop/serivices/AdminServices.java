package shop.clothesshop.serivices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.clothesshop.entities.Accounts;
import shop.clothesshop.entities.BillDetail;
import shop.clothesshop.entities.Product;
import shop.clothesshop.entities.adminrespon.AnalysisObject;
import shop.clothesshop.entities.adminrespon.MonthAnalysis;
import shop.clothesshop.entities.adminrespon.TopAccountPaid;
import shop.clothesshop.entities.adminrespon.TopProductSold;
import shop.clothesshop.repository.context.DBContext;
import shop.clothesshop.serivices.iservices.IAdminServices;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminServices implements IAdminServices {
    @Autowired
    private DBContext dbContext;

    @Override
    public AnalysisObject analysisShop12Month() {
        AnalysisObject ao = new AnalysisObject();
        ao.setProductCountShelling(dbContext.productRepo.productShellingTotal());
        ao.setCustumerCountActive(dbContext.accountRepo.custumerActiveTotal());
        ao.setVoucherCountUsing(dbContext.salesRepo.salesUsingTotal());
        ao.setProductQuantityInventory(dbContext.productRepo.countProductInventory());
        List<Integer> top5ProductSoldId = dbContext.productRepo.top5ProductSold();
        List<TopProductSold> top5ProductSold = new ArrayList<>();
        for (int id : top5ProductSoldId) {
            TopProductSold tps = new TopProductSold();
            Product p = dbContext.productRepo.findById(id).get();
            tps.setInventory(p.getQuantity());
            tps.setName(p.getProductName());
            tps.setIdProduct(id);
            List<BillDetail> allBillDetailOfThisProduct = dbContext.billDetailRepo.allBillDetailOfProductBillShipped(id);
            Integer soldQuantity = 0;
            for (BillDetail bd : allBillDetailOfThisProduct) {
                soldQuantity += bd.getQuantity();
            }
            tps.setSold(soldQuantity);
            top5ProductSold.add(tps);
        }
        ao.setTop5ProductSold(top5ProductSold);
        List<Integer> top5AccountPaidId = dbContext.billDetailRepo.top5AccountPaid();
        List<TopAccountPaid> top5AccountPaid = new ArrayList<>();
        for (int id : top5AccountPaidId) {
            TopAccountPaid tap = new TopAccountPaid();
            Accounts a = dbContext.accountRepo.findById(id).get();
            tap.setIdAccount(id);
            tap.setSdt(a.getSdt());
            tap.setName(a.getName());
            tap.setTotalPaid(dbContext.billDetailRepo.getTotalPaidByIdAccount(id));
            top5AccountPaid.add(tap);
        }
        ao.setTop5AccountPaid(top5AccountPaid);
        List<Integer> totalBillMonthByMonth = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            totalBillMonthByMonth.add(dbContext.billRepo.countBillInMonth(i));
        }
        ao.setTotalBillMonth(totalBillMonthByMonth);
        List<MonthAnalysis> monthAnalyses = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            MonthAnalysis ma = new MonthAnalysis();



            monthAnalyses.add(ma);
        }
        ao.setAnalysisProfit12Month(monthAnalyses);
        return ao;
    }
}
