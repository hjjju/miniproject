(function()
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
            obj._setContents("<ColumnInfo><Column id=\"MENU_ID\" type=\"STRING\" size=\"100\"/><Column id=\"MENU_NAME\" type=\"STRING\" size=\"100\"/><Column id=\"PARENT_ID\" type=\"STRING\" size=\"100\"/><Column id=\"MENU_ORDER\" type=\"INT\" size=\"4\"/><Column id=\"MENU_URL\" type=\"STRING\" size=\"100\"/><Column id=\"USE_YN\" type=\"STRING\" size=\"4\"/></ColumnInfo><Rows><Row><Col id=\"MENU_ID\">1231123</Col><Col id=\"MENU_NAME\">메뉴1</Col><Col id=\"PARENT_ID\"/><Col id=\"MENU_ORDER\">1</Col><Col id=\"MENU_URL\"/><Col id=\"USE_YN\">Y</Col></Row><Row><Col id=\"MENU_ID\">12312</Col><Col id=\"MENU_NAME\">메뉴2</Col><Col id=\"PARENT_ID\"/><Col id=\"MENU_ORDER\">2</Col><Col id=\"MENU_URL\"/><Col id=\"USE_YN\">Y</Col></Row></Rows>");
            this.addChild(obj.name, obj);

            obj = new Dataset("ds_parent", this);
            obj._setContents("<ColumnInfo><Column id=\"MENU_ID\" type=\"STRING\" size=\"256\"/><Column id=\"MENU_NAME\" type=\"STRING\" size=\"256\"/></ColumnInfo><Rows><Row><Col id=\"MENU_ID\">1231123</Col><Col id=\"MENU_NAME\">메뉴1</Col></Row><Row><Col id=\"MENU_ID\">12312</Col><Col id=\"MENU_NAME\">메뉴2</Col></Row></Rows>");
            this.addChild(obj.name, obj);


            
            // UI Components Initialize
            obj = new Button("btnSearch", "absolute", "101.76%", "56", null, "28", "-9.28%", null, this);
            obj.set_taborder("1");
            obj.set_text("조회");
            this.addChild(obj.name, obj);

            obj = new Button("btnAdd", "absolute", "112.7%", "56", null, "28", "-20.12%", null, this);
            obj.set_taborder("3");
            obj.set_text("추가");
            this.addChild(obj.name, obj);

            obj = new Button("btnDelete", "absolute", "123.54%", "56", null, "28", "-31.05%", null, this);
            obj.set_taborder("4");
            obj.set_text("삭제");
            this.addChild(obj.name, obj);

            obj = new Button("btnSave", "absolute", "1414", "56", null, "28", "-391", null, this);
            obj.set_taborder("2");
            obj.set_text("저장");
            this.addChild(obj.name, obj);

            obj = new Grid("GridMenu", "absolute", "28.61%", "192", null, "540", "1.56%", null, this);
            obj.set_taborder("5");
            obj.set_binddataset("ds_menu");
            obj.set_autosizingtype("row");
            obj._setContents("<Formats><Format id=\"default\"><Columns><Column size=\"34\"/><Column size=\"80\"/><Column size=\"80\"/><Column size=\"80\"/><Column size=\"80\"/><Column size=\"80\"/></Columns><Rows><Row size=\"24\" band=\"head\"/><Row size=\"24\"/></Rows><Band id=\"head\"><Cell text=\"No.\"/><Cell col=\"1\" text=\"MENU_NAME\"/><Cell col=\"2\" text=\"PARENT_ID\"/><Cell col=\"3\" text=\"MENU_ORDER\"/><Cell col=\"4\" text=\"MENU_URL\"/><Cell col=\"5\" displaytype=\"normal\" edittype=\"none\" text=\"USE_YN\" combodisplay=\"display\"/></Band><Band id=\"body\"><Cell text=\"expr:currow + 1\"/><Cell col=\"1\" text=\"bind:MENU_NAME\"/><Cell col=\"2\" text=\"bind:PARENT_ID\"/><Cell col=\"3\" text=\"bind:MENU_ORDER\"/><Cell col=\"4\" text=\"bind:MENU_URL\"/><Cell col=\"5\" displaytype=\"normal\" edittype=\"normal\" text=\"bind:USE_YN\" expr=\"expr:USE_YN == &quot;Y&quot;?&quot;사용&quot;:&quot;사용안함&quot;\" editdisplay=\"edit\" combodataset=\"bind:USE_YN\" combodisplay=\"edit\"/></Band></Format></Formats>");
            this.addChild(obj.name, obj);

            obj = new Div("topForm", "absolute", "27.54%", "16", null, "125", "1.56%", null, this);
            obj.set_taborder("8");
            obj.set_text("topFrossssss");
            obj.style.set_border("1 solid #808080ff");
            this.addChild(obj.name, obj);

            obj = new Div("leftDiv", "absolute", "8", "21", "30.08%", "739", null, null, this);
            obj.set_taborder("10");
            obj.set_text("leftDiv");
            this.addChild(obj.name, obj);
            obj = new ImageViewer("hnwLogo", "absolute", "0", "0", "282", "129", null, null, this.leftDiv);
            obj.set_taborder("0");
            obj.set_stretch("none");
            obj.style.set_border("1 solid #808080ff");
            this.leftDiv.addChild(obj.name, obj);


            
            // Layout Functions
            //-- Default Layout
            obj = new Layout("default", "", 726, 125, this.topForm,
            	//-- Layout function
            	function(p) {
            		p.set_taborder("8");
            		p.set_text("topFrossssss");
            		p.style.set_border("1 solid #808080ff");

            	}
            );
            this.topForm.addLayout(obj.name, obj);

            //-- Default Layout
            obj = new Layout("default", "", 308, 739, this.leftDiv,
            	//-- Layout function
            	function(p) {
            		p.set_taborder("10");
            		p.set_text("leftDiv");

            	}
            );
            this.leftDiv.addLayout(obj.name, obj);

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

        this.Div01_Combo00_onitemchanged = function(obj,e)
        {
        	
        }

        this.Div01_TextArea00_oneditclick = function(obj,e)
        {
        	
        }

        this.Div01_Radio00_onitemclick = function(obj,e)
        {
        	
        }

        this.Button01_onclick = function(obj,e)
        {
        	this.ds_menu.addRow();
        }

        this.fn_test = function(nRow)
        {
        	return nRow;
        }

        //조회
        this.Button00_onclick = function(obj,e)
        {
        //   this.transaction(
        //     "selectMenuList"	//구분id
        // 	,"http://localhost:8080/menuList" //url
        // 	,"" //서버에서 받는 dataset server=client
        // 	,"ds_menu=ds_menu"//클라이언트에서 받는 데이터셋  client=server	
        // 	,"" //변수
        // 	,"tr_c" //콜백함수
        // 	); 
        } 

        
        //callback함수
        this.tr_c = function(sid,ncd,smsg)
        {

        //error check
        	if(ncd <0 )
        	{
        		alert(smsg);
        		return false;
        	}
        	else
        	{
        		if(sid == "selectMenuList")
        		trace(this.ds_menu.saveXML());
        		
        	}
        }

        
        
        });


        
        // Regist UI Components Event
        this.on_initEvent = function()
        {
            this.btnSearch.addEventHandler("onclick", this.Button00_onclick, this);
            this.btnAdd.addEventHandler("onclick", this.Button01_onclick, this);
            this.btnDelete.addEventHandler("onclick", this.Button02_onclick, this);
            this.GridMenu.addEventHandler("onexpandup", this.Grid00_onexpandup, this);

        };

        this.loadIncludeScript("frmMenu.xfdl", true);

       
    };
}
)();
