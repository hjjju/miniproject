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
                this.set_name("frmHello");
                this.set_titletext("New Form");
                this._setFormPosition(0,0,800,768);
            }

            
            // Object(Dataset, ExcelExportObject) Initialize

            
            // UI Components Initialize
            obj = new Button("Button00", "absolute", "76.38%", "102", null, "50", "8.63%", null, this);
            obj.set_taborder("0");
            obj.set_text("hello");
            obj.style.set_background("#33ccccff");
            this.addChild(obj.name, obj);

            obj = new WebBrowser("WebBrowser00", "absolute", "15%", "137", null, "329", "29.5%", null, this);
            obj.set_taborder("1");
            obj.set_url("https://www.google.com/webhp?igu=1");
            this.addChild(obj.name, obj);


            
            // Layout Functions
            //-- Default Layout
            obj = new Layout("default", "", 800, 768, this,
            	//-- Layout function
            	function(p) {
            		p.set_titletext("New Form");

            	}
            );
            this.addLayout(obj.name, obj);


            
            // BindItem Information

            
            // Remove Reference
            obj = null;
        };
        

        
        // User Script
        this.registerScript("frmHello.xfdl", function(exports) {

        this.Button00_onclick = function(obj,e)
        {
        	this.alert("hello");
        }
        
        });


        
        // Regist UI Components Event
        this.on_initEvent = function()
        {
            this.Button00.addEventHandler("onclick", this.Button00_onclick, this);

        };

        this.loadIncludeScript("frmHello.xfdl", true);

       
    };
}
)();
