/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Account;
import entity.Category;
import entity.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
//TANG DAN PRICE
//select * from Product where price < 700
//order by price asc


public class DAO extends MyDAO {

    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();

        xSql = "select * from product ";
        try {
            ps = connection.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), rs.getFloat(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Account> getAllAccount() {
        List<Account> list = new ArrayList<>();

        xSql = "  select * from Account where \n"
                + "  (isSell=0 and isAdmin =1) \n"
                + "  or (isSell=1 and isAdmin =0) or\n"
                + "  isSell=0 or isAdmin = 0";
        try {
            ps = connection.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Account> getAllAccount2() {
        List<Account> list = new ArrayList<>();

        xSql = "  select * from Account ";
        try {
            ps = connection.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Product> getProductById(int id) {
        List<Product> list = new ArrayList<>();

        xSql = "select * from product where 1=1";
        if (id != 0) {
            xSql += " and cateID =" + id;
        }
        try {
            ps = connection.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), rs.getFloat(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public Product getProductID(int id) {

        xSql = "select * from product where id=?";

        try {
            ps = connection.prepareStatement(xSql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1), rs.getFloat(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public Account getAccountID(int id) {
        xSql = "select * from Account where id =?";
        try {
            ps = connection.prepareStatement(xSql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<Product> getProductByIdSell(int id) {
        List<Product> list = new ArrayList<>();

        xSql = "select * from Product where idSeller = ?";

        try {
            ps = connection.prepareStatement(xSql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), rs.getFloat(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Product> getProductBySearch(String name) {
        List<Product> list = new ArrayList<>();

        xSql = "select * from Product where [name] like ?";
        try {
            ps = connection.prepareStatement(xSql);
            ps.setString(1, "%" + name + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), rs.getFloat(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();
        xSql = "select * from category";

        try {
            ps = connection.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Category(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public Account login(String user, String pass) {
        String query = "select * from Account where [user] = ? and [password] = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5));
            }

        } catch (Exception e) {
        }
        return null;
    }

    public Account checkAccount(String user) {
        String query = "select * from Account where [user] =?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public int getMaxID() {
        xSql = "select top 1 id from Account order by id desc";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            int id;

            while (rs.next()) {
                Account x = new Account();
                id = rs.getInt("id");
                return id;
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int getMaxIDProduct() {
        xSql = "select top 1 id from Product order by id desc";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            int id;

            while (rs.next()) {
                id = rs.getInt("id");
                return id;
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int getMaxIDAccount() {
        xSql = "select top 1 id from Account order by id desc";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                return id;
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public Account signUp(String user, String pass) {
        String query = "INSERT INTO [dbo].[Account]\n"
                + "           ([id]\n"
                + "           ,[user]\n"
                + "           ,[password]\n"
                + "           ,[isSell]\n"
                + "           ,[isAdmin])\n"
                + "     VALUES\n"
                + "           (?,?,?,0,0)";
        try {
            int id = getMaxID() + 1;
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2, user);
            ps.setString(3, pass);
            ps.executeUpdate();

        } catch (Exception e) {
        }
        return null;
    }

    public void delete(String id) {
        String query1 = "delete from Product where id = ?";
        try {
            ps = connection.prepareStatement(query1);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void deleteAccount(int id) {
        String query1 = "delete from Account where id = ?";
        try {
            ps = connection.prepareStatement(query1);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void insert(float price, String name, int quantity, String brand, String image, int cateid, int idsell) {
        String query = "INSERT INTO Product (id, price, name, quantity, brand, image, cateid, idseller) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            int id = getMaxIDProduct() + 1;
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            ps.setFloat(2, price);
            ps.setString(3, name);
            ps.setInt(4, quantity);
            ps.setString(5, brand);
            ps.setString(6, image);
            ps.setInt(7, cateid);
            ps.setInt(8, idsell);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertAccount(String user, String password, int isSell, int isAdmin) {
        String query = "INSERT INTO [dbo].[Account]\n"
                + "           ([id]\n"
                + "           ,[user]\n"
                + "           ,[password]\n"
                + "           ,[isSell]\n"
                + "           ,[isAdmin])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?)";
        try {
            int id = getMaxIDAccount() + 1;
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2, user);
            ps.setString(3, password);
            ps.setInt(4, isSell);
            ps.setInt(5, isAdmin);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void edit(float price, String name, int quantity, String brand, String image, int cateid, int idsell, int id) {
        String query = "UPDATE [dbo].[Product]\n"
                + "   SET [price] = ?\n"
                + "      ,[name] = ?\n"
                + "      ,[quantity] = ?\n"
                + "      ,[brand] = ?\n"
                + "      ,[image] = ?\n"
                + "      ,[cateID] = ?\n"
                + "      ,[idSeller] = ?\n"
                + " WHERE id =?";
        try {
            ps = connection.prepareStatement(query);
            ps.setFloat(1, price);
            ps.setString(2, name);
            ps.setInt(3, quantity);
            ps.setString(4, brand);
            ps.setString(5, image);
            ps.setInt(6, cateid);
            ps.setInt(7, idsell);
            ps.setInt(8, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void editAccount(String user, String password, int isSell, int isAdmin, int id) {
        String query = "UPDATE [dbo].[Account]\n"
                + "   SET [user] = ?\n"
                + "      ,[password] = ?\n"
                + "      ,[isSell] = ?\n"
                + "      ,[isAdmin] = ?\n"
                + " WHERE id=?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, password);
            ps.setInt(3, isSell);
            ps.setInt(4, isSell);
            ps.setInt(5, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        DAO dao = new DAO();
        Product pro = dao.getProductID(1);
        System.out.println(pro.toString());
    }
}
