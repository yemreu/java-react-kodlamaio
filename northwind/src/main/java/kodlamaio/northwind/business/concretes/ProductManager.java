package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{

	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>(productDao.findAll(),"Ürünler listelendi.");
	}
	
	@Override
	public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
		return new SuccessDataResult<List<Product>>(productDao.findAll(PageRequest.of(pageNo - 1, pageSize)).getContent(),"Ürünler listelendi.");
	}
	
	@Override
	public DataResult<List<Product>> getAllSorted() {
		return new SuccessDataResult<List<Product>>(productDao.findAll(Sort.by(Sort.Direction.DESC,"unitPrice")),"Ürünler listelendi.");
	}

	@Override
	public Result add(Product product) {
		productDao.save(product);
		return new SuccessResult("Ürün eklendi.");
	}

	
	  @Override public DataResult<Product> getByProductName(String productName) {
	  return new
	  SuccessDataResult<Product>(productDao.getByProductName(productName)
	  ,"Ürünler listelendi."); }
	 

	@Override
	public DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId) {
		return new SuccessDataResult<Product>(productDao.getByProductNameAndCategory_CategoryId(productName,categoryId),"Ürünler listelendi.");
	}

	@Override
	public DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId) {
		return new SuccessDataResult<List<Product>>(productDao.getByProductNameOrCategory_CategoryId(productName,categoryId),"Ürünler listelendi.");
	}

	@Override
	public DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories) {
		return new SuccessDataResult<List<Product>>(productDao.getByCategory_CategoryIdIn(categories),"Ürünler listelendi.");
	}

	@Override
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		return new SuccessDataResult<List<Product>>(productDao.getByProductNameContains(productName),"Ürünler listelendi.");
	}

	@Override
	public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
		return new SuccessDataResult<List<Product>>(productDao.getByProductNameStartsWith(productName),"Ürünler listelendi.");
	}

	@Override
	public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
		return new SuccessDataResult<List<Product>>(productDao.getByNameAndCategory(productName,categoryId),"Ürünler listelendi.");
	}

}
