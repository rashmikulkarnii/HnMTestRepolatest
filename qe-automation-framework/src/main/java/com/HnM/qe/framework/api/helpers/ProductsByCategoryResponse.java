package com.HnM.qe.framework.api.helpers;

import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import com.HnM.qe.framework.common.Constants;

public class ProductsByCategoryResponse {
	private static final Logger logger = Logger.getLogger(ProductsByCategoryResponse.class);
	public Object recordSetTotal ;
	public Object recordSetCount;
	public JSONObject productsByCategoryRespRoot;
	public JSONArray sortByInfoArray;
	public JSONArray productinfoArray;
	public JSONArray facetsArray;

	public ProductsByCategoryResponse() {}

	public ProductsByCategoryResponse(String responseStr){

		try {
			productsByCategoryRespRoot = JSONValidationUtils.getJSONObject(responseStr);

			if(productsByCategoryRespRoot.containsKey("recordSetTotal")){
				recordSetTotal = productsByCategoryRespRoot.get("recordSetTotal");
				logger.debug("RecordSetTotal::"+recordSetTotal);
			}

			if(productsByCategoryRespRoot.containsKey("recordSetCount")){
				recordSetCount = productsByCategoryRespRoot.get("recordSetCount");
				logger.debug("RecordSetCount::"+recordSetCount);
			}

			if(productsByCategoryRespRoot.containsKey("sortByInfo")){
				sortByInfoArray= (JSONArray) productsByCategoryRespRoot.get("sortByInfo");
				logger.debug("SortByInfoArray Size::"+sortByInfoArray.size());
			}

			if(productsByCategoryRespRoot.containsKey("productinfo")){
				productinfoArray= (JSONArray) productsByCategoryRespRoot.get("productinfo");
				logger.debug("ProductinfoArray Size::"+productinfoArray.size());
			}

			if(productsByCategoryRespRoot.containsKey("facets")){
				facetsArray= (JSONArray) productsByCategoryRespRoot.get("facets");
				logger.debug("FacetsArray Size::"+facetsArray.size());
			}
		} catch (ParseException e) {
			logger.error("ProductsByCategoryResponse ParseException msg::"+e.getMessage());
			e.printStackTrace();
		}
	}


	public boolean validateSortByInfo(String name, String excepted){
		boolean flag = false;
		try{
			for (Object obj : sortByInfoArray) {
				JSONObject sortByInfo = (JSONObject) obj;

				String cname = (String) sortByInfo.get(name);
				logger.debug(name+"::" + cname);
				if(excepted.equals(cname)){
					flag = true;
					break;
				}
			}
		}catch (Exception e) {
			logger.error("validateSortByInfo Exception Msg::"+e.getMessage());
		}
		return flag;
	}

	public boolean validateProductInfo(String name, String excepted){
		boolean flag = false;
		try{
			for (Object obj : productinfoArray) {
				JSONObject productinfo = (JSONObject) obj;

				String cname = (String) productinfo.get(name);
				logger.debug(name+"::" + cname);
				if(excepted.equals(cname)){
					flag = true;
					break;
				}
			}
		}catch (Exception e) {
			flag = false;
			logger.error("validateProductInfo Exception Msg::"+e.getMessage());
		}
		return flag;
	}

	public boolean isSortByInfoPropertyValueNull(String name){
		boolean flag = false;
		Constants.API_ERROR_DESCRIPTION="";
		try{
			for (Object obj : sortByInfoArray) {
				JSONObject sortByInfo = (JSONObject) obj;

				if(sortByInfo.containsKey(name)){
					if (JSONValidationUtils.isNotNull(sortByInfo, name)){
						flag = true;
					}else{
						flag = false;
						break;
					}
				}
			}
		}catch (Exception e) {
			flag = false;
			logger.error(name+"   :isSortByInfoPropertyValueNull Exception Msg::"+e.getMessage());
		}
		if(!flag){
			Constants.API_ERROR_DESCRIPTION=name+Constants.API_ERROR_TEXT;
			logger.debug(Constants.API_ERROR_DESCRIPTION);
		}
		return flag;
	}

	public boolean isPropertyValueNull(String name,JSONArray jsonArray){
		boolean flag = false;
		Constants.API_ERROR_DESCRIPTION="";
		try{
			for (Object obj : jsonArray) {
				JSONObject productinfo = (JSONObject) obj;

				if(productinfo.containsKey(name)){
					if (JSONValidationUtils.isNotNull(productinfo, name)){
						flag = true;
					}else{
						flag = false;
						break;
					}
				}
			}
		}catch (Exception e) {
			flag = false;
			logger.error(name+"  :isPropertyValueNull Exception Msg::"+e.getMessage());
		}
		if(!flag){
			Constants.API_ERROR_DESCRIPTION=name+Constants.API_ERROR_TEXT;
			logger.debug(Constants.API_ERROR_DESCRIPTION);
		}
		return flag;
	}

	public boolean isContainsPropertyValueNull(String name,String searchText,JSONArray jsonArray){
		boolean flag = false;
		Constants.API_ERROR_DESCRIPTION="";
		try{
			for (Object obj : jsonArray) {
				JSONObject productinfo = (JSONObject) obj;

				if(productinfo.containsKey(name)){

	            	String searchtxt =(String) productinfo.get(name);
	            	if(searchtxt != null && searchtxt.toLowerCase().contains(searchText.toLowerCase())){
	            		flag = true;
	            	}else{
	            		flag = false;
	            		break;
	            	}
				}
			}
		}catch (Exception e) {
			flag = false;
			logger.error(name+"  :isPropertyValueNull Exception Msg::"+e.getMessage());
		}
		if(!flag){
			Constants.API_ERROR_DESCRIPTION=name+Constants.API_ERROR_TEXT;
			logger.debug(Constants.API_ERROR_DESCRIPTION);
		}
		return flag;
	}

	
	public boolean isContainsBreadcrumbPropertyValue(String propertyType, String brandName, String name){
		boolean flag = false;
		Constants.API_ERROR_DESCRIPTION="";
		try{
			logger.debug("Json Response:: "+propertyType);
			if(productsByCategoryRespRoot.containsKey(propertyType)){ //"categorysuggestion"
				 JSONArray siteContentArray = (JSONArray) productsByCategoryRespRoot.get(propertyType);
		            
		            for (Object sitecontentObj : siteContentArray) {
		            	JSONObject jsonObj = (JSONObject) sitecontentObj;
		            	String searchtxt =(String) jsonObj.get(name);
		            	if(searchtxt != null && searchtxt.toLowerCase().contains(brandName.toLowerCase())){
		            		flag = true;
		            	}else{
		            		flag = false;
		            		break;
		            	}
		            	
		            }
			}
		}catch (Exception e) {
			flag = false;
			logger.error(name+" :isPropertyValueNull Exception Msg::"+e.getMessage());
		}
		if(!flag){
			Constants.API_ERROR_DESCRIPTION=name+Constants.API_ERROR_TEXT;
			logger.debug(Constants.API_ERROR_DESCRIPTION);
		}
		return flag;
	}
	public boolean isProductInfoDefaultSkuPricePropertyValueNull(String name){
		boolean flag = false;
		Constants.API_ERROR_DESCRIPTION="";
		try{
			for (Object obj : productinfoArray) {
				JSONObject productinfo = (JSONObject) obj;

				JSONObject defaultSkuPriceArray =(JSONObject) productinfo.get("defaultSkuPrice");
				if(defaultSkuPriceArray.containsKey(name)){
					if (JSONValidationUtils.isNotNull(defaultSkuPriceArray, name)){
						flag = true;
					}else{
						flag = false;
						break;
					}
				}
			}
		}catch (Exception e) {
			flag = false;
			logger.error(name+"   :isProductInfoDefaultSkuPricePropertyValueNull Exception Msg::"+e.getMessage());
		}
		if(!flag){
			Constants.API_ERROR_DESCRIPTION=name+Constants.API_ERROR_TEXT;
			logger.debug(Constants.API_ERROR_DESCRIPTION);
		}
		return flag;
	}

	public boolean isFacetsLabelsPropertyValueNull(String name){
		boolean flag = false;
		Constants.API_ERROR_DESCRIPTION="";
		try{
			for (Object obj : facetsArray) {
				JSONObject facetsObj = (JSONObject) obj;

				JSONArray labelsArray =(JSONArray) facetsObj.get("labels");
				for(Object lableObj: labelsArray){
					JSONObject lable = (JSONObject) lableObj;
					if(lable.containsKey(name)){
						if (JSONValidationUtils.isNotNull(lable, name)){
							flag = true;
						}else{
							flag = false;
							break;
						}
					}
				}


			}
		}catch (Exception e) {
			flag = false;
			logger.error(name+"  :: isFacetsLabelsPropertyValueNull Exception Msg::"+e.getMessage());
		}
		if(!flag){
			Constants.API_ERROR_DESCRIPTION=name+Constants.API_ERROR_TEXT;
			logger.debug(Constants.API_ERROR_DESCRIPTION);
		}
		return flag;
	}
	public boolean validateProductInfoById(String productId, String name, String excepted){
		boolean flag = false;
		try{
			for (Object obj : productinfoArray) {
				JSONObject productinfo = (JSONObject) obj;
				String pId = (String) productinfo.get("id");
				logger.debug(productId+"::isproductIdMatched::" + pId);
				if(productId.equals(pId)){
					String cname = (String) productinfo.get(name);
					logger.debug(name+"::" + cname);
					if(excepted.equals(cname)){
						flag = true;
						break;
					}
				}

			}
		}catch (Exception e) {
			logger.error("validateProductInfoById Exception Msg::"+e.getMessage());
		}
		return flag;
	}

	public boolean validateFacets(String name, String excepted){
		boolean flag = false;
		try{
			for (Object obj : facetsArray) {
				JSONObject facets = (JSONObject) obj;

				String cname = (String) facets.get(name);
				logger.debug(name+"::" + cname);
				if(excepted.equals(cname)){
					flag = true;
					break;
				}
			}
		}catch (Exception e) {
			logger.error("validateFacets Exception Msg::"+e.getMessage());
		}
		return flag;
	}

	public boolean validateFacetLabels(String name, String excepted){
		boolean flag = false;
		try{
			for (Object obj : facetsArray) {
				JSONObject facets = (JSONObject) obj;

				if(facets.containsKey("labels")){
					JSONArray labelsArray= (JSONArray) facets.get("labels");
					logger.debug("Facets Labels Array Size::"+labelsArray.size());

					for (Object labelObj : labelsArray) {
						JSONObject label = (JSONObject) labelObj;

						String cname = (String) label.get(name);
						logger.debug(name+"::" + cname);
						if(excepted.equals(cname)){
							flag = true;
							break;
						}
					}
				}else {
					logger.debug("%%%%%%%%%%%%%%%%% Facet Labels Not Found................ Please check response.");
				}
			}
		}catch (Exception e) {
			logger.error("validateFacetLabels Exception Msg::"+e.getMessage());
		}
		return flag;
	}
}
