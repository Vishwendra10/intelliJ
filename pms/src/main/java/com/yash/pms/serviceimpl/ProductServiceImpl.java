package com.yash.pms.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.yash.pms.model.Product;
import com.yash.pms.service.ProductService;

public class ProductServiceImpl implements ProductService{

	List<Product> list1=new ArrayList<>();
	
//	private DataSource dataSource;
//	  
//    public void setDataSource(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }
	
	
	public ProductServiceImpl()
		{	
		list1.add(new Product(01,"Pen",20));
		list1.add(new Product(02,"Laptop",20000));
		list1.add(new Product(03,"Phone",30000));
		list1.add(new Product(04,"Notebook",50));
		}
	
	@Override
	public List<Product> getDetails() {
		return list1;
		// TODO Auto-generated method stub	
		
	}
	
	public Product getDetailsById(int id)
		{
		Product data=null;
		for(int i=0;i<list1.size();i++)
			{
				if(id==list1.get(i).getPid())
					{
						data=list1.get(i);
						break;
					}
			}
		return data;
		
		
//		String sql = "SELECT * FROM EMPLOYEE WHERE ID = ?";
//		  
//        Connection conn = null;
//  
//        try {
//            conn = dataSource.getConnection();
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setInt(1, id);
//            Product product = null;
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                product = new Product(
//                    rs.getInt("ID"),
//                    rs.getString("NAME"), 
//                    rs.getDouble("PRICE")
//                );
//            }
//            rs.close();
//            ps.close();
//            return product;
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if (conn != null) {
//                try {
//                conn.close();
//                } catch (SQLException e) {}
//            }
//        }
//    }
	}
	
	public Product save(Product data)
		{
			list1.add(data);
			return data;
			
//			String sql = "INSERT INTO product " +
//	                "(ID, NAME, PRICE) VALUES (?, ?, ?)";
//	        Connection conn = null;
//			
//			try {
//	            conn = dataSource.getConnection();
//	            PreparedStatement ps = conn.prepareStatement(sql);
//	            ps.setInt(1, data.getPid());
//	            ps.setString(2, data.gePname());
//	            ps.setDouble(3, data.getPrice());
//	            ps.executeUpdate();
//	            ps.close();
	//  
//	        } catch (SQLException e) {
//	            throw new RuntimeException(e);
	//  
//	        } finally {
//	            if (conn != null) {
//	                try {
//	                    conn.close();
//	                } catch (SQLException e) {}
//	            }
			
			
		}
	
	public Product delete(int delid)
	{
		Product data=null;
		for(int i=0;i<list1.size();i++)
			{
				if(delid==list1.get(i).getPid())
					{
						data=list1.get(i);
						list1.remove(data);
					}
			}
		return data;
	}
	
	

}
