package com.HnM.qe.framework.api.helpers;

import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import com.HnM.qe.framework.common.Constants;

public class CategoryDetailsResponse {
	private static final Logger logger = Logger.getLogger(CategoryDetailsResponse.class);
	public JSONObject categoryDetailsJSONObj;
	//private JSONObject subCategoriesJSONObj;
	public JSONArray categoriesArray;
	//private JSONArray subCategoriesArray;

	public CategoryDetailsResponse() { }
	public CategoryDetailsResponse(String responseStr) {
		try {
			categoryDetailsJSONObj = JSONValidationUtils.getJSONObject(responseStr);

			if(categoryDetailsJSONObj.containsKey("categories")){
				categoriesArray= (JSONArray) categoryDetailsJSONObj.get("categories");
				logger.debug("categoriesArray Size::"+categoryDetailsJSONObj.size());
			}

		} catch (ParseException e) {
			logger.error("JSON Response Parse Read excetion msg::"+e.getMessage());
			e.printStackTrace();
		}
	}

	public boolean validateCategoryDetails(String categoryId, String name, String excepted){
		boolean flag = false;
		try{
			for (Object categoryObj : categoriesArray) {
				JSONObject category = (JSONObject) categoryObj;
				String id = (String) category.get("categoryId");
				logger.debug("categoryId::::" + id);

				if(categoryId.equals(id)){
					String cname = (String) category.get(name);
					logger.debug(name+"::" + cname);
					if(excepted.equals(cname)){
						flag = true;
					}
					break;
				}

			}
		}catch (Exception e) {
			logger.error("validateCategoryDetails Exception Msg::"+e.getMessage());
		}
		return flag;
	}

	public boolean validateCategoryDetails( String name, String excepted){
		boolean flag = false;
		try{
			for (Object categoryObj : categoriesArray) {
				JSONObject category = (JSONObject) categoryObj;

				String cname = (String) category.get(name);
				logger.debug(name+"::" + cname);
				if(excepted.equals(cname)){
					flag = true;
					break;
				}
			}
		}catch (Exception e) {
			logger.error("validateCategoryDetails Exception Msg::"+e.getMessage());
		}
		return flag;
	}

	public boolean isCategoryPropertyValueNull(String name){
		boolean flag = false;
		Constants.API_ERROR_DESCRIPTION="";
		try{
			for (Object categoryObj : categoriesArray) {
				JSONObject category = (JSONObject) categoryObj;
				if(category.containsKey(name)){
					if (JSONValidationUtils.isNotNull(category, name)){
						flag = true;
					}else{
						flag = false;
						break;
					}
				}
			}
		}catch (Exception e) {
			flag = false;
			logger.error(name+" :isCategoryPropertyValueNull Exception Msg::"+e.getMessage());
		}
		if(!flag){
			Constants.API_ERROR_DESCRIPTION=name+Constants.API_ERROR_TEXT;
			logger.debug(Constants.API_ERROR_DESCRIPTION);
		}
		return flag;
	}

	public boolean isSubCategoryPropertyValueNull(String name){
		boolean flag = false;
		Constants.API_ERROR_DESCRIPTION="";
		try{
			for (Object categoryObj : categoriesArray) {
				JSONObject category = (JSONObject) categoryObj;
				String id = (String) category.get("categoryId");
				logger.debug("categoryId::::" + id);

				if(category.containsKey("subCategories")){
					JSONArray subCategoriesArray = (JSONArray) category.get("subCategories");
					logger.debug("subCategoriesArray SIZE::"+subCategoriesArray.size());
					for (Object subObj : subCategoriesArray) {
						JSONObject subCategories = (JSONObject) subObj;

						if(subCategories.containsKey(name)){
							if (JSONValidationUtils.isNotNull(subCategories, name)){
								flag = true;
							}else{
								flag = false;
								break;
							}
						}
					}
				}else{
					flag = false;
					logger.debug("subCategories not found......... "+name);
				}

			}
		}catch (Exception e) {
			flag = false;
			logger.error(name+"   :isSubCategoryPropertyValueNull Exception Msg::"+e.getMessage());
		}
		if(!flag){
			Constants.API_ERROR_DESCRIPTION=name+Constants.API_ERROR_TEXT;
			logger.debug(Constants.API_ERROR_DESCRIPTION);
		}
		return flag;
	}
	public boolean validateSubCategoryDetails(String categoryId, String name, String excepted){
		boolean flag = false;
		try{
			for (Object categoryObj : categoriesArray) {
				JSONObject category = (JSONObject) categoryObj;
				String id = (String) category.get("categoryId");
				logger.debug("categoryId::::" + id);

				if(categoryId.equals(id) && category.containsKey("subCategories")){
					JSONArray subCategoriesArray = (JSONArray) category.get("subCategories");
					logger.debug("subCategoriesArray SIZE::"+subCategoriesArray.size());
					for (Object subObj : subCategoriesArray) {
						JSONObject subCategories = (JSONObject) subObj;

						String cname = (String) subCategories.get(name);
						logger.debug(name+"::" + cname);
						if(excepted.equals(cname)){
							flag = true;
						}
						break;
					}
				}else{
					logger.debug("actual & excepted categoryID not matched or subCategories not found......... please check response");
				}

			}
		}catch (Exception e) {
			logger.error("validateSubCategoryDetails Exception Msg::"+e.getMessage());
		}
		return flag;
	}

	public boolean validateSubCategoryDetails(String name, String excepted){
		boolean flag = false;
		try{
			for (Object categoryObj : categoriesArray) {
				JSONObject category = (JSONObject) categoryObj;
				if(category.containsKey("subCategories")){
					JSONArray subCategoriesArray = (JSONArray) category.get("subCategories");
					logger.debug("subCategoriesArray SIZE::"+subCategoriesArray.size());
					for (Object subObj : subCategoriesArray) {
						JSONObject subCategories = (JSONObject) subObj;

						String cname = (String) subCategories.get(name);
						logger.debug(name+"::" + cname);
						if(excepted.equals(cname)){
							flag = true;
						}
						break;
					}
				}else {
					logger.debug("%%%%%%%%%%%%%% subCategories not found......... please check response");
				}
			}
		}catch (Exception e) {
			logger.error("validateSubCategoryDetails Exception Msg::"+e.getMessage());
		}
		return flag;
	}
}
