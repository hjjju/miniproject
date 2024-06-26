﻿(function()
{
    return function()
    {
        if (!this._is_form)
            return;
        
        this.on_create = function()
        {
            // Declare Reference
            var obj = null;
            
            if (Form == this.constructor) {
                this.set_name("mainFrane");
                this.set_titletext("mainFrame");
                this._setFormPosition(0,0,1024,768);
            }

            
            // Object(Dataset, ExcelExportObject) Initialize
            obj = new Dataset("ds_menu", this);
            obj._setContents("<ColumnInfo><Column id=\"MENU_ID\" type=\"STRING\" size=\"100\"/><Column id=\"MENU_NAME\" type=\"STRING\" size=\"100\"/><Column id=\"PARENT_ID\" type=\"STRING\" size=\"100\"/><Column id=\"MENU_ORDER\" type=\"INT\" size=\"4\"/><Column id=\"MENU_URL\" type=\"STRING\" size=\"100\"/><Column id=\"USE_YN\" type=\"STRING\" size=\"4\"/></ColumnInfo><Rows><Row><Col id=\"MENU_ID\">1</Col><Col id=\"MENU_NAME\">메뉴1</Col><Col id=\"PARENT_ID\"/><Col id=\"MENU_ORDER\">1</Col><Col id=\"MENU_URL\"/><Col id=\"USE_YN\">Y</Col></Row><Row><Col id=\"MENU_ID\">2</Col><Col id=\"MENU_NAME\">메뉴2</Col><Col id=\"PARENT_ID\"/><Col id=\"MENU_ORDER\">2</Col><Col id=\"MENU_URL\"/><Col id=\"USE_YN\">Y</Col></Row><Row><Col id=\"MENU_ID\">3</Col><Col id=\"MENU_NAME\">메뉴2</Col><Col id=\"PARENT_ID\">1</Col><Col id=\"MENU_ORDER\">1</Col><Col id=\"USE_YN\">Y</Col></Row><Row><Col id=\"MENU_ID\">4</Col><Col id=\"MENU_NAME\">메뉴3</Col><Col id=\"PARENT_ID\">2</Col><Col id=\"MENU_ORDER\">1</Col><Col id=\"USE_YN\">Y</Col></Row></Rows>");
            this.addChild(obj.name, obj);

            obj = new Dataset("ds_parent", this);
            obj._setContents("<ColumnInfo><Column id=\"MENU_ID\" type=\"STRING\" size=\"256\"/><Column id=\"MENU_NAME\" type=\"STRING\" size=\"256\"/></ColumnInfo><Rows><Row><Col id=\"MENU_ID\">1231123</Col><Col id=\"MENU_NAME\">메뉴1</Col></Row><Row><Col id=\"MENU_ID\">12312</Col><Col id=\"MENU_NAME\">메뉴2</Col></Row></Rows>");
            this.addChild(obj.name, obj);

            obj = new Dataset("ds_left_menu", this);
            obj._setContents("<ColumnInfo><Column id=\"label\" type=\"STRING\" size=\"256\"/><Column id=\"level\" type=\"STRING\" size=\"256\"/></ColumnInfo>");
            this.addChild(obj.name, obj);


            
            // UI Components Initialize
            obj = new Button("btnAdd", "absolute", null, "52", "60", "40", "300", null, this);
            obj.set_taborder("3");
            obj.set_text("추가");
            this.addChild(obj.name, obj);

            obj = new Button("btnDelete", "absolute", null, "52", "60", "40", "210", null, this);
            obj.set_taborder("4");
            obj.set_text("삭제");
            this.addChild(obj.name, obj);

            obj = new Button("btnSave", "absolute", null, "52", "60", "40", "33", null, this);
            obj.set_taborder("2");
            obj.set_text("저장");
            this.addChild(obj.name, obj);

            obj = new Grid("GridMenu", "absolute", null, "108", "752", null, "10", "10", this);
            obj.set_taborder("5");
            obj.set_binddataset("ds_menu");
            obj.set_autosizingtype("none");
            obj.set_autosizebandtype("summary");
            obj.set_autoupdatetype("none");
            obj.set_autofittype("col");
            obj._setContents("<Formats><Format id=\"default\"><Columns><Column size=\"89\"/><Column size=\"147\"/><Column size=\"142\"/><Column size=\"141\"/><Column size=\"97\"/></Columns><Rows><Row size=\"41\" band=\"head\"/><Row size=\"68\"/></Rows><Band id=\"head\"><Cell text=\"No.\"/><Cell col=\"1\" text=\"MENU_NAME\"/><Cell col=\"2\" text=\"MENU_ORDER\"/><Cell col=\"3\" text=\"MENU_URL\"/><Cell col=\"4\" displaytype=\"normal\" edittype=\"none\" text=\"USE_YN\" combodisplay=\"display\"/></Band><Band id=\"body\"><Cell text=\"expr:currow + 1\"/><Cell col=\"1\" text=\"bind:MENU_NAME\"/><Cell col=\"2\" text=\"bind:MENU_ORDER\"/><Cell col=\"3\" text=\"bind:MENU_URL\"/><Cell col=\"4\" displaytype=\"normal\" edittype=\"normal\" text=\"bind:USE_YN\" expr=\"expr:USE_YN == &quot;Y&quot;?&quot;사용&quot;:&quot;사용안함&quot;\" editdisplay=\"edit\" combodataset=\"bind:USE_YN\" combodisplay=\"edit\"/></Band></Format></Formats>");
            this.addChild(obj.name, obj);

            obj = new Button("btnSearch", "absolute", null, "52", "60", "40", "117", null, this);
            obj.set_taborder("11");
            obj.set_text("조회");
            this.addChild(obj.name, obj);

            obj = new ImageViewer("logoImage", "absolute", "10", "10", "154", "40", null, null, this);
            obj.set_taborder("12");
            obj.set_image("URL('theme://images/customlogo.png')");
            obj.set_stretch("fit");
            this.addChild(obj.name, obj);

            obj = new Grid("Grid00", "absolute", "1.56%", "64", null, "674", "83.98%", null, this);
            obj.set_taborder("13");
            obj.set_binddataset("ds_left_menu");
            obj.set_fillareatype("none");
            obj._setContents("<Formats><Format id=\"default\"><Columns><Column size=\"80\"/><Column size=\"80\"/></Columns><Rows><Row size=\"24\" band=\"head\"/><Row size=\"24\"/></Rows><Band id=\"head\"><Cell text=\"label\" expr=\"bind:label\"/><Cell col=\"1\" text=\"level\" expr=\"bind:level\"/></Band><Band id=\"body\"><Cell displaytype=\"tree\" edittype=\"tree\" text=\"bind:label\" treelevel=\"bind:level\"/><Cell col=\"1\" text=\"bind:level\"/></Band></Format></Formats>");
            this.addChild(obj.name, obj);


            
            // Layout Functions
            //-- Default Layout
            obj = new Layout("default", "", 1024, 768, this,
            	//-- Layout function
            	function(p) {
            		p.set_titletext("mainFrame");

            	}
            );
            this.addLayout(obj.name, obj);


            
            // BindItem Information

            
            // Remove Reference
            obj = null;
        };
        

        
        // User Script
        this.registerScript("frmMenu.xfdl", function(exports) {
        this.strJsonData //서버에서 보내준 JSON스트링 데이터를 strJsonData 변수에 담기 위해 선언

        
        this.Application_onload = function(obj,e)
        {
          if(system.navigatorname!="nexacro")this.changeFavicon();
        };

        //favicon이미지경로
        this.changeFavicon = function() 
        {
          var link = document.createElement('link');
          link.id = 'dynamic-favicon';
          link.rel = 'shortcut icon';
          link.href = "./favicon.ico";
          
          document.head.appendChild(link);
        }

        

        this.Button01_onclick = function(obj,e)
        {
        	this.ds_menu.addRow();
        }

        this.fn_test = function(nRow)
        {
        	return nRow;
        }

        

        
        this.Button00_onclick = function(obj,e)
        {
        	this.transaction(
        		"selectMenuList"	//구분id
        		,"http://127.0.0.1:8080/menuList" //url
        		,"" //서버에서 받는 dataset server=client
        		,"ds_menu=ds_menu"//클라이언트에서 받는 데이터셋  client=server	
        		,"" //변수
        		,"tr_c" //콜백함수
        	); 
        }

        //callback함수
        this.tr_c = function(strId,errCode,errMsg)
        {
        	alert("!!");
        	trace(strId + "  " + errCode +"  " + errMsg);

        	 if(errCode <0){
        		trace(errMsg)
        	 }else{
        		alert(errMsg);
        	 }
         }

        
        this.logoImage.set_image('url("file://C:\Dev\nexa\nexaP\image")');

        

        

        
        
        });


        
        // Regist UI Components Event
        this.on_initEvent = function()
        {
            this.addEventHandler("onload", this.mainFrane_onload, this);
            this.btnAdd.addEventHandler("onclick", this.Button01_onclick, this);
            this.btnDelete.addEventHandler("onclick", this.Button02_onclick, this);
            this.GridMenu.addEventHandler("onexpandup", this.Grid00_onexpandup, this);
            this.btnSearch.addEventHandler("onclick", this.Button00_onclick, this);

        };

        this.loadIncludeScript("frmMenu.xfdl", true);

       
    };
}
)();
