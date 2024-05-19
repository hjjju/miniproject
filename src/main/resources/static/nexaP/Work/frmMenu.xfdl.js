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
                this.set_name("frmMenu");
                this.set_titletext("New Form");
                this._setFormPosition(0,0,1107,746);
            }

            
            // Object(Dataset, ExcelExportObject) Initialize
            obj = new Dataset("ds_menu", this);
            obj._setContents("<ColumnInfo><Column id=\"MENU_ID\" type=\"STRING\" size=\"100\"/><Column id=\"MENU_NAME\" type=\"STRING\" size=\"100\"/><Column id=\"PARENT_ID\" type=\"STRING\" size=\"100\"/><Column id=\"MENU_ORDER\" type=\"INT\" size=\"4\"/><Column id=\"MENU_URL\" type=\"STRING\" size=\"100\"/><Column id=\"USE_YN\" type=\"STRING\" size=\"4\"/></ColumnInfo><Rows><Row><Col id=\"MENU_ID\">1231123</Col><Col id=\"MENU_NAME\">메뉴1</Col><Col id=\"PARENT_ID\"/><Col id=\"MENU_ORDER\">1</Col><Col id=\"MENU_URL\"/><Col id=\"USE_YN\">Y</Col></Row><Row><Col id=\"MENU_ID\">12312</Col><Col id=\"MENU_NAME\">메뉴2</Col><Col id=\"PARENT_ID\"/><Col id=\"MENU_ORDER\">2</Col><Col id=\"MENU_URL\"/><Col id=\"USE_YN\">Y</Col></Row></Rows>");
            this.addChild(obj.name, obj);

            obj = new Dataset("ds_parent", this);
            obj._setContents("<ColumnInfo><Column id=\"MENU_ID\" type=\"STRING\" size=\"256\"/><Column id=\"MENU_NAME\" type=\"STRING\" size=\"256\"/></ColumnInfo><Rows><Row><Col id=\"MENU_ID\">1231123</Col><Col id=\"MENU_NAME\">메뉴1</Col></Row><Row><Col id=\"MENU_ID\">12312</Col><Col id=\"MENU_NAME\">메뉴2</Col></Row></Rows>");
            this.addChild(obj.name, obj);


            
            // UI Components Initialize
            obj = new Static("Static00", "absolute", "2.5%", "9", null, "42", "89.88%", null, this);
            obj.set_taborder("0");
            obj.set_text("메뉴관리");
            obj.style.set_font("13 Dotum");
            this.addChild(obj.name, obj);

            obj = new Button("Button00", "absolute", "13.5%", "8", null, "28", "79%", null, this);
            obj.set_taborder("1");
            obj.set_text("조회");
            this.addChild(obj.name, obj);

            obj = new Button("Button01", "absolute", "24.38%", "8", null, "28", "68.13%", null, this);
            obj.set_taborder("3");
            obj.set_text("추가");
            this.addChild(obj.name, obj);

            obj = new Button("Button02", "absolute", "35.25%", "8", null, "28", "57.25%", null, this);
            obj.set_taborder("4");
            obj.set_text("삭제");
            this.addChild(obj.name, obj);

            obj = new Button("Button03", "absolute", "46.13%", "8", null, "28", "46.38%", null, this);
            obj.set_taborder("2");
            obj.set_text("저장");
            this.addChild(obj.name, obj);

            obj = new Grid("Grid00", "absolute", "13.01%", "64", null, "335", "40.56%", null, this);
            obj.set_taborder("5");
            obj.set_binddataset("ds_menu");
            obj._setContents("<Formats><Format id=\"default\"><Columns><Column size=\"40\"/><Column size=\"34\"/><Column size=\"80\"/><Column size=\"80\"/><Column size=\"80\"/><Column size=\"80\"/><Column size=\"80\"/><Column size=\"80\"/></Columns><Rows><Row size=\"24\" band=\"head\"/><Row size=\"24\"/></Rows><Band id=\"head\"><Cell text=\"Fn\"/><Cell col=\"1\" text=\"No.\"/><Cell col=\"2\" text=\"MENU_ID\"/><Cell col=\"3\" text=\"MENU_NAME\"/><Cell col=\"4\" text=\"PARENT_ID\"/><Cell col=\"5\" text=\"MENU_ORDER\"/><Cell col=\"6\" text=\"MENU_URL\"/><Cell col=\"7\" displaytype=\"normal\" edittype=\"none\" text=\"USE_YN\" combodisplay=\"display\"/></Band><Band id=\"body\"><Cell text=\"expr:comp.parent.fn_test(currow)\"/><Cell col=\"1\" text=\"expr:currow + 1\"/><Cell col=\"2\" text=\"bind:MENU_ID\"/><Cell col=\"3\" text=\"bind:MENU_NAME\"/><Cell col=\"4\" text=\"bind:PARENT_ID\"/><Cell col=\"5\" text=\"bind:MENU_ORDER\"/><Cell col=\"6\" text=\"bind:MENU_URL\"/><Cell col=\"7\" displaytype=\"normal\" edittype=\"normal\" text=\"bind:USE_YN\" expr=\"expr:USE_YN == &quot;Y&quot;?&quot;사용&quot;:&quot;사용안함&quot;\" editdisplay=\"edit\" combodataset=\"bind:USE_YN\" combodisplay=\"edit\"/></Band></Format></Formats>");
            this.addChild(obj.name, obj);

            obj = new Div("Div01", "absolute", "61.52%", "61", null, "341", "11.65%", null, this);
            obj.set_taborder("8");
            obj.set_text("Div01");
            obj.style.set_background("#faebb8b2");
            this.addChild(obj.name, obj);
            obj = new Static("Static00", "absolute", "6.01%", "5", null, "22", "73.39%", null, this.Div01);
            obj.set_taborder("0");
            obj.set_text("메뉴Id");
            obj.style.set_background("#dce0e2ff");
            this.Div01.addChild(obj.name, obj);
            obj = new Static("Static01", "absolute", "6.01%", "65", null, "22", "73.39%", null, this.Div01);
            obj.set_taborder("1");
            obj.set_text("메뉴이름");
            obj.style.set_background("#dce0e2ff");
            this.Div01.addChild(obj.name, obj);
            obj = new Static("Static02", "absolute", "6.01%", "125", null, "22", "73.39%", null, this.Div01);
            obj.set_taborder("2");
            obj.set_text("상위메뉴Id");
            obj.style.set_background("#dce0e2ff");
            this.Div01.addChild(obj.name, obj);
            obj = new Static("Static03", "absolute", "6.01%", "185", null, "22", "73.39%", null, this.Div01);
            obj.set_taborder("3");
            obj.set_text("메뉴순서");
            obj.style.set_background("#dce0e2ff");
            this.Div01.addChild(obj.name, obj);
            obj = new Static("Static04", "absolute", "6.01%", "245", null, "22", "73.39%", null, this.Div01);
            obj.set_taborder("4");
            obj.set_text("메뉴url");
            obj.style.set_background("#dce0e2ff");
            this.Div01.addChild(obj.name, obj);
            obj = new Static("Static05", "absolute", "6.01%", "308", null, "22", "73.39%", null, this.Div01);
            obj.set_taborder("5");
            obj.set_text("사용여부");
            obj.style.set_background("#dce0e2ff");
            this.Div01.addChild(obj.name, obj);
            obj = new Edit("Edit00", "absolute", "40.99%", "7", null, "17", "14.91%", null, this.Div01);
            obj.set_taborder("6");
            this.Div01.addChild(obj.name, obj);
            obj = new TextArea("TextArea00", "absolute", "40.99%", "66", null, "17", "14.91%", null, this.Div01);
            obj.set_taborder("7");
            this.Div01.addChild(obj.name, obj);
            obj = new TextArea("TextArea03", "absolute", "40.99%", "243", null, "17", "14.91%", null, this.Div01);
            obj.set_taborder("10");
            this.Div01.addChild(obj.name, obj);
            obj = new Radio("Radio00", "absolute", "40.99%", "309", null, "17", "14.91%", null, this.Div01);
            this.Div01.addChild(obj.name, obj);
            var Radio00_innerdataset = new Dataset("Radio00_innerdataset", this.Div01.Radio00);
            Radio00_innerdataset._setContents("<ColumnInfo><Column id=\"codecolumn\" size=\"256\"/><Column id=\"datacolumn\" size=\"256\"/></ColumnInfo><Rows><Row><Col id=\"codecolumn\">Y</Col><Col id=\"datacolumn\">사용</Col></Row><Row><Col id=\"codecolumn\">N</Col><Col id=\"datacolumn\">사용안함</Col></Row></Rows>");
            obj.set_innerdataset(Radio00_innerdataset);
            obj.set_taborder("11");
            obj.set_codecolumn("codecolumn");
            obj.set_datacolumn("datacolumn");
            obj.set_columncount("2");
            obj.set_index("-1");
            obj = new Combo("Combo00", "absolute", "40.99%", "125", null, "17", "14.91%", null, this.Div01);
            this.Div01.addChild(obj.name, obj);
            obj.set_taborder("12");
            obj.set_text("Combo00");
            obj.set_innerdataset("@ds_parent");
            obj.set_codecolumn("MENU_ID");
            obj.set_datacolumn("MENU_NAME");
            obj = new MaskEdit("MaskEdit00", "absolute", "40.99%", "184", null, "17", "14.91%", null, this.Div01);
            obj.set_taborder("13");
            obj.set_type("number");
            obj.set_mask("AA-###");
            obj.set_maskchar(" ");
            this.Div01.addChild(obj.name, obj);


            
            // Layout Functions
            //-- Default Layout
            obj = new Layout("default", "", 322, 341, this.Div01,
            	//-- Layout function
            	function(p) {
            		p.set_taborder("8");
            		p.set_text("Div01");
            		p.style.set_background("#faebb8b2");

            	}
            );
            this.Div01.addLayout(obj.name, obj);

            //-- Default Layout
            obj = new Layout("default", "", 1107, 746, this,
            	//-- Layout function
            	function(p) {
            		p.set_titletext("New Form");

            	}
            );
            this.addLayout(obj.name, obj);


            
            // BindItem Information
            obj = new BindItem("item0","Div01.Edit00","value","ds_menu","MENU_ID");
            this.addChild(obj.name, obj);
            obj.bind();
            obj = new BindItem("item1","Div01.TextArea00","value","ds_menu","MENU_NAME");
            this.addChild(obj.name, obj);
            obj.bind();
            obj = new BindItem("item2","Div01.Combo00","value","ds_menu","PARENT_ID");
            this.addChild(obj.name, obj);
            obj.bind();
            obj = new BindItem("item3","Div01.MaskEdit00","value","ds_menu","MENU_ORDER");
            this.addChild(obj.name, obj);
            obj.bind();
            obj = new BindItem("item4","Div01.TextArea03","value","ds_menu","MENU_URL");
            this.addChild(obj.name, obj);
            obj.bind();
            obj = new BindItem("item5","Div01.Radio00","value","ds_menu","USE_YN");
            this.addChild(obj.name, obj);
            obj.bind();

            
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
        	this.transaction(
        		"selectMenuList"	//구분id
        	,"http://localhost/menuList" //url
        	,"" //서버에서 받는 dataset server=client
        	,"ds_menu=ds_menuList"//클라이언트에서 받는 데이터셋  client=server	
        	,"" //변수
        	,"tr_c" //콜백함수
        	);
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
            this.Button00.addEventHandler("onclick", this.Button00_onclick, this);
            this.Button01.addEventHandler("onclick", this.Button01_onclick, this);
            this.Button02.addEventHandler("onclick", this.Button02_onclick, this);
            this.Grid00.addEventHandler("onexpandup", this.Grid00_onexpandup, this);
            this.Div01.TextArea00.addEventHandler("oneditclick", this.Div01_TextArea00_oneditclick, this);
            this.Div01.Radio00.addEventHandler("onitemclick", this.Div01_Radio00_onitemclick, this);
            this.Div01.Combo00.addEventHandler("onitemchanged", this.Div01_Combo00_onitemchanged, this);

        };

        this.loadIncludeScript("frmMenu.xfdl", true);

       
    };
}
)();
