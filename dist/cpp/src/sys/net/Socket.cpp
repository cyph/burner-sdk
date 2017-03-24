// Generated by Haxe 3.4.2
#include <hxcpp.h>

#ifndef INCLUDED_Reflect
#include <Reflect.h>
#endif
#ifndef INCLUDED_cpp_Lib
#include <cpp/Lib.h>
#endif
#ifndef INCLUDED_haxe_io_Bytes
#include <haxe/io/Bytes.h>
#endif
#ifndef INCLUDED_haxe_io_Input
#include <haxe/io/Input.h>
#endif
#ifndef INCLUDED_haxe_io_Output
#include <haxe/io/Output.h>
#endif
#ifndef INCLUDED_sys_net_Host
#include <sys/net/Host.h>
#endif
#ifndef INCLUDED_sys_net_Socket
#include <sys/net/Socket.h>
#endif
#ifndef INCLUDED_sys_net__Socket_SocketInput
#include <sys/net/_Socket/SocketInput.h>
#endif
#ifndef INCLUDED_sys_net__Socket_SocketOutput
#include <sys/net/_Socket/SocketOutput.h>
#endif

HX_DEFINE_STACK_FRAME(_hx_pos_123d5468720475b0_123_new,"sys.net.Socket","new",0x202a8cf7,"sys.net.Socket.new","/usr/share/haxe/std/cpp/_std/sys/net/Socket.hx",123,0xb72d4153)
HX_LOCAL_STACK_FRAME(_hx_pos_123d5468720475b0_126_init,"sys.net.Socket","init",0x01c98299,"sys.net.Socket.init","/usr/share/haxe/std/cpp/_std/sys/net/Socket.hx",126,0xb72d4153)
HX_LOCAL_STACK_FRAME(_hx_pos_123d5468720475b0_132_close,"sys.net.Socket","close",0x18d3680f,"sys.net.Socket.close","/usr/share/haxe/std/cpp/_std/sys/net/Socket.hx",132,0xb72d4153)
HX_LOCAL_STACK_FRAME(_hx_pos_123d5468720475b0_151_write,"sys.net.Socket","write",0xa0c9bd36,"sys.net.Socket.write","/usr/share/haxe/std/cpp/_std/sys/net/Socket.hx",151,0xb72d4153)
HX_LOCAL_STACK_FRAME(_hx_pos_123d5468720475b0_155_connect,"sys.net.Socket","connect",0x1ee69001,"sys.net.Socket.connect","/usr/share/haxe/std/cpp/_std/sys/net/Socket.hx",155,0xb72d4153)
HX_LOCAL_STACK_FRAME(_hx_pos_123d5468720475b0_188_shutdown,"sys.net.Socket","shutdown",0x9b2f3c9f,"sys.net.Socket.shutdown","/usr/share/haxe/std/cpp/_std/sys/net/Socket.hx",188,0xb72d4153)
HX_LOCAL_STACK_FRAME(_hx_pos_123d5468720475b0_239_setTimeout,"sys.net.Socket","setTimeout",0x1b505368,"sys.net.Socket.setTimeout","/usr/share/haxe/std/cpp/_std/sys/net/Socket.hx",239,0xb72d4153)
HX_LOCAL_STACK_FRAME(_hx_pos_123d5468720475b0_254_select,"sys.net.Socket","select",0xfc0916c5,"sys.net.Socket.select","/usr/share/haxe/std/cpp/_std/sys/net/Socket.hx",254,0xb72d4153)
namespace sys{
namespace net{

void Socket_obj::__construct(){
            	HX_STACKFRAME(&_hx_pos_123d5468720475b0_123_new)
HXDLIN( 123)		this->init();
            	}

Dynamic Socket_obj::__CreateEmpty() { return new Socket_obj; }

void *Socket_obj::_hx_vtable = 0;

Dynamic Socket_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< Socket_obj > _hx_result = new Socket_obj();
	_hx_result->__construct();
	return _hx_result;
}

bool Socket_obj::_hx_isInstanceOf(int inClassId) {
	return inClassId==(int)0x00000001 || inClassId==(int)0x109f852f;
}

void Socket_obj::init(){
            	HX_GC_STACKFRAME(&_hx_pos_123d5468720475b0_126_init)
HXLINE( 127)		if (hx::IsNull( this->__s )) {
HXLINE( 127)			this->__s = _hx_std_socket_new(false);
            		}
HXLINE( 128)		this->input =  ::sys::net::_Socket::SocketInput_obj::__alloc( HX_CTX ,this->__s);
HXLINE( 129)		this->output =  ::sys::net::_Socket::SocketOutput_obj::__alloc( HX_CTX ,this->__s);
            	}


HX_DEFINE_DYNAMIC_FUNC0(Socket_obj,init,(void))

void Socket_obj::close(){
            	HX_STACKFRAME(&_hx_pos_123d5468720475b0_132_close)
HXLINE( 133)		_hx_std_socket_close(this->__s);
HXLINE( 134)		{
HXLINE( 135)			 ::sys::net::_Socket::SocketInput input = ( ( ::sys::net::_Socket::SocketInput)(this->input) );
HXLINE( 136)			 ::sys::net::_Socket::SocketOutput output = ( ( ::sys::net::_Socket::SocketOutput)(this->output) );
HXLINE( 137)			input->__s = null();
HXLINE( 138)			output->__s = null();
            		}
HXLINE( 140)		this->input->close();
HXLINE( 141)		this->output->close();
            	}


HX_DEFINE_DYNAMIC_FUNC0(Socket_obj,close,(void))

void Socket_obj::write(::String content){
            	HX_STACKFRAME(&_hx_pos_123d5468720475b0_151_write)
HXDLIN( 151)		_hx_std_socket_write(this->__s,::haxe::io::Bytes_obj::ofString(content)->b);
            	}


HX_DEFINE_DYNAMIC_FUNC1(Socket_obj,write,(void))

void Socket_obj::connect( ::sys::net::Host host,int port){
            	HX_STACKFRAME(&_hx_pos_123d5468720475b0_155_connect)
HXDLIN( 155)		try {
            			HX_STACK_CATCHABLE(::String, 0);
HXLINE( 156)			bool _hx_tmp;
HXDLIN( 156)			if ((host->ip == (int)0)) {
HXLINE( 156)				_hx_tmp = (host->host != HX_("0.0.0.0",76,1a,39,f2));
            			}
            			else {
HXLINE( 156)				_hx_tmp = false;
            			}
HXDLIN( 156)			if (_hx_tmp) {
HXLINE( 158)				::Array< unsigned char > ipv6 = ( (::Array< unsigned char >)(::Reflect_obj::field(host,HX_("ipv6",a7,ca,bc,45))) );
HXLINE( 159)				if (hx::IsNotNull( ipv6 )) {
HXLINE( 161)					this->close();
HXLINE( 162)					this->__s = _hx_std_socket_new(false,true);
HXLINE( 163)					this->init();
HXLINE( 164)					_hx_std_socket_connect_ipv6(this->__s,ipv6,port);
            				}
            				else {
HXLINE( 167)					HX_STACK_DO_THROW(HX_("Unresolved host",77,5e,1e,d3));
            				}
            			}
            			else {
HXLINE( 170)				_hx_std_socket_connect(this->__s,host->ip,port);
            			}
            		}
            		catch( ::Dynamic _hx_e){
            			if (_hx_e.IsClass< ::String >() ){
            				HX_STACK_BEGIN_CATCH
            				::String s = _hx_e;
HXLINE( 172)				if ((s == HX_("Invalid socket handle",6c,15,f9,09))) {
HXLINE( 173)					HX_STACK_DO_THROW((((HX_("Failed to connect on ",a9,2b,e3,45) + host->toString()) + HX_(":",3a,00,00,00)) + port));
            				}
            				else {
HXLINE( 174)					if ((s != HX_("Blocking",d5,e1,61,f3))) {
HXLINE( 179)						HX_STACK_DO_RETHROW(s);
            					}
            				}
            			}
            			else {
            				HX_STACK_DO_THROW(_hx_e);
            			}
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC2(Socket_obj,connect,(void))

void Socket_obj::shutdown(bool read,bool write){
            	HX_STACKFRAME(&_hx_pos_123d5468720475b0_188_shutdown)
HXDLIN( 188)		_hx_std_socket_shutdown(this->__s,read,write);
            	}


HX_DEFINE_DYNAMIC_FUNC2(Socket_obj,shutdown,(void))

void Socket_obj::setTimeout(Float timeout){
            	HX_STACKFRAME(&_hx_pos_123d5468720475b0_239_setTimeout)
HXDLIN( 239)		_hx_std_socket_set_timeout(this->__s,timeout);
            	}


HX_DEFINE_DYNAMIC_FUNC1(Socket_obj,setTimeout,(void))

 ::Dynamic Socket_obj::select(::Array< ::Dynamic> read,::Array< ::Dynamic> write,::Array< ::Dynamic> others, ::Dynamic timeout){
            	HX_STACKFRAME(&_hx_pos_123d5468720475b0_254_select)
HXLINE( 255)		::cpp::VirtualArray neko_array = _hx_std_socket_select(read,write,others,timeout);
HXLINE( 256)		if (hx::IsNull( neko_array )) {
HXLINE( 257)			HX_STACK_DO_THROW(HX_("Select error",c4,23,4b,b6));
            		}
HXLINE( 258)		return  ::Dynamic(hx::AnonStruct3_obj< ::Array< ::Dynamic>,::Array< ::Dynamic>,::Array< ::Dynamic> >::Create(HX_("read",56,4b,a7,4b),( (::Array< ::Dynamic>)(neko_array->__get((int)0)) ),HX_("write",df,6c,59,d0),( (::Array< ::Dynamic>)(neko_array->__get((int)1)) ),HX_("others",a3,8f,23,71),( (::Array< ::Dynamic>)(neko_array->__get((int)2)) )));
            	/*?*/}


STATIC_HX_DEFINE_DYNAMIC_FUNC4(Socket_obj,select,return )


hx::ObjectPtr< Socket_obj > Socket_obj::__new() {
	hx::ObjectPtr< Socket_obj > __this = new Socket_obj();
	__this->__construct();
	return __this;
}

hx::ObjectPtr< Socket_obj > Socket_obj::__alloc(hx::Ctx *_hx_ctx) {
	Socket_obj *__this = (Socket_obj*)(hx::Ctx::alloc(_hx_ctx, sizeof(Socket_obj), true, "sys.net.Socket"));
	*(void **)__this = Socket_obj::_hx_vtable;
	__this->__construct();
	return __this;
}

Socket_obj::Socket_obj()
{
}

void Socket_obj::__Mark(HX_MARK_PARAMS)
{
	HX_MARK_BEGIN_CLASS(Socket);
	HX_MARK_MEMBER_NAME(__s,"__s");
	HX_MARK_MEMBER_NAME(input,"input");
	HX_MARK_MEMBER_NAME(output,"output");
	HX_MARK_END_CLASS();
}

void Socket_obj::__Visit(HX_VISIT_PARAMS)
{
	HX_VISIT_MEMBER_NAME(__s,"__s");
	HX_VISIT_MEMBER_NAME(input,"input");
	HX_VISIT_MEMBER_NAME(output,"output");
}

hx::Val Socket_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 3:
		if (HX_FIELD_EQ(inName,"__s") ) { return hx::Val( __s ); }
		break;
	case 4:
		if (HX_FIELD_EQ(inName,"init") ) { return hx::Val( init_dyn() ); }
		break;
	case 5:
		if (HX_FIELD_EQ(inName,"input") ) { return hx::Val( input ); }
		if (HX_FIELD_EQ(inName,"close") ) { return hx::Val( close_dyn() ); }
		if (HX_FIELD_EQ(inName,"write") ) { return hx::Val( write_dyn() ); }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"output") ) { return hx::Val( output ); }
		break;
	case 7:
		if (HX_FIELD_EQ(inName,"connect") ) { return hx::Val( connect_dyn() ); }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"shutdown") ) { return hx::Val( shutdown_dyn() ); }
		break;
	case 10:
		if (HX_FIELD_EQ(inName,"setTimeout") ) { return hx::Val( setTimeout_dyn() ); }
	}
	return super::__Field(inName,inCallProp);
}

bool Socket_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 6:
		if (HX_FIELD_EQ(inName,"select") ) { outValue = select_dyn(); return true; }
	}
	return false;
}

hx::Val Socket_obj::__SetField(const ::String &inName,const hx::Val &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 3:
		if (HX_FIELD_EQ(inName,"__s") ) { __s=inValue.Cast<  ::Dynamic >(); return inValue; }
		break;
	case 5:
		if (HX_FIELD_EQ(inName,"input") ) { input=inValue.Cast<  ::haxe::io::Input >(); return inValue; }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"output") ) { output=inValue.Cast<  ::haxe::io::Output >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

void Socket_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("__s","\x53","\x69","\x48","\x00"));
	outFields->push(HX_HCSTRING("input","\x0a","\xc4","\x1d","\xbe"));
	outFields->push(HX_HCSTRING("output","\x01","\x0f","\x81","\x0c"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo Socket_obj_sMemberStorageInfo[] = {
	{hx::fsObject /*Dynamic*/ ,(int)offsetof(Socket_obj,__s),HX_HCSTRING("__s","\x53","\x69","\x48","\x00")},
	{hx::fsObject /*::haxe::io::Input*/ ,(int)offsetof(Socket_obj,input),HX_HCSTRING("input","\x0a","\xc4","\x1d","\xbe")},
	{hx::fsObject /*::haxe::io::Output*/ ,(int)offsetof(Socket_obj,output),HX_HCSTRING("output","\x01","\x0f","\x81","\x0c")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo *Socket_obj_sStaticStorageInfo = 0;
#endif

static ::String Socket_obj_sMemberFields[] = {
	HX_HCSTRING("__s","\x53","\x69","\x48","\x00"),
	HX_HCSTRING("input","\x0a","\xc4","\x1d","\xbe"),
	HX_HCSTRING("output","\x01","\x0f","\x81","\x0c"),
	HX_HCSTRING("init","\x10","\x3b","\xbb","\x45"),
	HX_HCSTRING("close","\xb8","\x17","\x63","\x48"),
	HX_HCSTRING("write","\xdf","\x6c","\x59","\xd0"),
	HX_HCSTRING("connect","\xea","\x3b","\x80","\x15"),
	HX_HCSTRING("shutdown","\x96","\xfc","\x0b","\x6b"),
	HX_HCSTRING("setTimeout","\x1f","\x3f","\xd6","\x2b"),
	::String(null()) };

static void Socket_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Socket_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void Socket_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Socket_obj::__mClass,"__mClass");
};

#endif

hx::Class Socket_obj::__mClass;

static ::String Socket_obj_sStaticFields[] = {
	HX_HCSTRING("select","\xfc","\x1a","\x33","\x6a"),
	::String(null())
};

void Socket_obj::__register()
{
	hx::Object *dummy = new Socket_obj;
	Socket_obj::_hx_vtable = *(void **)dummy;
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("sys.net.Socket","\x85","\x45","\x9d","\xb4");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &Socket_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = Socket_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(Socket_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(Socket_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< Socket_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = Socket_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = Socket_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = Socket_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace sys
} // end namespace net
