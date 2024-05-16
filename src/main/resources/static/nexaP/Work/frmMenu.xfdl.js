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
                this._setFormPosition(0,0,800,768);
            }

            
            // Object(Dataset, ExcelExportObject) Initialize
            obj = new Dataset("ds_menu", this);
            obj._setContents("<ColumnInfo><Column id=\"menuId\" type=\"STRING\" size=\"100\" datapath=\"@.menuId\"/><Column id=\"menuName\" type=\"STRING\" size=\"100\" datapath=\"@.menuName\"/><Column id=\"parentId\" type=\"STRING\" size=\"100\" datapath=\"@.parentId\"/><Column id=\"menuOrder\" type=\"INT\" size=\"4\" datapath=\"@.menuOrder\"/><Column id=\"menuUrl\" type=\"STRING\" size=\"100\" datapath=\"@.menuUrl\"/><Column id=\"useYn\" type=\"STRING\" size=\"4\" datapath=\"@.useYn\"/></ColumnInfo><Rows><Row><Col id=\"menuId\">AA001</Col><Col id=\"menuName\">menu1</Col><Col id=\"parentId\"/><Col id=\"menuOrder\">1</Col><Col id=\"menuUrl\">M</Col><Col id=\"useYn\">Y</Col></Row></Rows>");
            this.addChild(obj.name, obj);

            obj = new Dataset("Dataset01", this);
            obj._setContents("");
            this.addChild(obj.name, obj);


            
            // UI Components Initialize
            obj = new Static("Static00", "absolute", "2.5%", "9", null, "42", "89.88%", null, this);
            obj.set_taborder("0");
            obj.set_text("메뉴관리");
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

            obj = new Grid("Grid00", "absolute", "13%", "64", null, "335", "32.25%", null, this);
            obj.set_taborder("5");
            obj.set_binddataset("ds_menu");
            obj._setContents("<Formats><Format id=\"default\"><Columns><Column size=\"80\"/><Column size=\"80\"/><Column size=\"80\"/><Column size=\"80\"/><Column size=\"80\"/><Column size=\"80\"/></Columns><Rows><Row band=\"head\" size=\"24\"/><Row band=\"body\" size=\"24\"/></Rows><Band id=\"head\"><Cell col=\"0\" disptype=\"normal\" text=\"MENU_ID\"/><Cell col=\"1\" disptype=\"normal\" text=\"MENU_NAME\"/><Cell col=\"2\" disptype=\"normal\" text=\"PARENT_ID\"/><Cell col=\"3\" disptype=\"normal\" text=\"MENU_ORDER\"/><Cell col=\"4\" disptype=\"normal\" text=\"MENU_URL\"/><Cell col=\"5\" disptype=\"normal\" text=\"USE_YN\"/></Band><Band id=\"body\"><Cell col=\"0\" disptype=\"normal\" text=\"bind:MENU_ID\"/><Cell col=\"1\" disptype=\"normal\" text=\"bind:MENU_NAME\"/><Cell col=\"2\" disptype=\"normal\" text=\"bind:PARENT_ID\"/><Cell col=\"3\" disptype=\"normal\" text=\"bind:MENU_ORDER\"/><Cell col=\"4\" disptype=\"normal\" text=\"bind:MENU_URL\"/><Cell col=\"5\" disptype=\"normal\" text=\"bind:USE_YN\"/></Band></Format></Formats>");
            this.addChild(obj.name, obj);

            obj = new Div("Div01", "absolute", "69.25%", "59", null, "341", "1.63%", null, this);
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
            obj = new Edit("Edit00", "absolute", "45.92%", "7", null, "17", "9.87%", null, this.Div01);
            obj.set_taborder("6");
            this.Div01.addChild(obj.name, obj);
            obj = new TextArea("TextArea00", "absolute", "45.92%", "66", null, "17", "9.87%", null, this.Div01);
            obj.set_taborder("7");
            this.Div01.addChild(obj.name, obj);
            obj = new TextArea("TextArea03", "absolute", "45.92%", "243", null, "17", "9.87%", null, this.Div01);
            obj.set_taborder("10");
            this.Div01.addChild(obj.name, obj);
            obj = new Radio("Radio00", "absolute", "45.92%", "302", null, "17", "9.87%", null, this.Div01);
            this.Div01.addChild(obj.name, obj);
            obj.set_taborder("11");
            obj = new Combo("Combo00", "absolute", "45.92%", "125", null, "17", "9.87%", null, this.Div01);
            this.Div01.addChild(obj.name, obj);
            obj.set_taborder("12");
            obj.set_text("Combo00");
            obj = new MaskEdit("MaskEdit00", "absolute", "45.92%", "184", null, "17", "9.87%", null, this.Div01);
            obj.set_taborder("13");
            this.Div01.addChild(obj.name, obj);


            
            // Layout Functions
            //-- Default Layout
            obj = new Layout("default", "", 0, 341, this.Div01,
            	//-- Layout function
            	function(p) {
            		p.set_taborder("8");
            		p.set_text("Div01");
            		p.style.set_background("#faebb8b2");

            	}
            );
            this.Div01.addLayout(obj.name, obj);

            //-- Default Layout
            obj = new Layout("default", "", 800, 768, this,
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
            obj = new BindItem("item4","Div01.TextArea03","value","ds_menu","MENU_URL");
            this.addChild(obj.name, obj);
            obj.bind();
            obj = new BindItem("item5","Div01.Radio00","value","ds_menu","USE_YN");
            this.addChild(obj.name, obj);
            obj.bind();
            obj = new BindItem("item2","Div01.Combo00","value","ds_menu","PARENT_ID");
            this.addChild(obj.name, obj);
            obj.bind();
            obj = new BindItem("item3","Div01.MaskEdit00","value","ds_menu","MENU_ORDER");
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

        //조회 버튼 클릭시
        this.Button00_onclick = function(obj,e)
        {

        	this.fnSearch();
        	application.trace("조회");

        }

        

        
        //데이터 조회 트랜잭션
        this.fnSearch = function(){
        	
          var strSvcId    = "menu";
          var strSvcUrl   = "svc::menu";
          //var inData      = "input1=ds_menu";
          var outData     = "ds_menu=output1";
          var strArg      = "";
          var callBackFnc = "fnCallback";
          var isAsync     = true;

          this.transaction(strSvcId ,     // transaction을 구분하기 위한 svc id값
                    strSvcUrl ,   // trabsaction을 요청할 주소
                  //  inData ,     // 입력값으로 보낼 dataset id , a=b형태로 실제이름과 입력이름을 매칭
                    outData ,     // 처리결과값으로 받을 dataset id, a=b형태로 실제이름과 입력이름을 매칭
                    strArg,     // 입력값으로 보낼 arguments, a=b
                    callBackFnc,   // transaction의 결과를 받을 Function 이름
                    isAsync);     // 비동기통신 여부 [생략가능]

        }
        
        });


        
        // Regist UI Components Event
        this.on_initEvent = function()
        {
            this.Button00.addEventHandler("onclick", this.Button00_onclick, this);
            this.Div01.TextArea00.addEventHandler("oneditclick", this.Div01_TextArea00_oneditclick, this);
            this.Div01.Combo00.addEventHandler("onitemchanged", this.Div01_Combo00_onitemchanged, this);

        };

        this.loadIncludeScript("frmMenu.xfdl", true);

       
    };
}
)();
