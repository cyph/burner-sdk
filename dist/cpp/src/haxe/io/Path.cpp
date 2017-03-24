// Generated by Haxe 3.4.2
#include <hxcpp.h>

#ifndef INCLUDED_haxe_io_Path
#include <haxe/io/Path.h>
#endif

HX_LOCAL_STACK_FRAME(_hx_pos_6cfed01bf295c856_262_addTrailingSlash,"haxe.io.Path","addTrailingSlash",0x8b4f8e69,"haxe.io.Path.addTrailingSlash","/usr/share/haxe/std/haxe/io/Path.hx",262,0x457392de)
HX_LOCAL_STACK_FRAME(_hx_pos_6cfed01bf295c856_287_removeTrailingSlashes,"haxe.io.Path","removeTrailingSlashes",0x2dc73462,"haxe.io.Path.removeTrailingSlashes","/usr/share/haxe/std/haxe/io/Path.hx",287,0x457392de)
namespace haxe{
namespace io{

void Path_obj::__construct() { }

Dynamic Path_obj::__CreateEmpty() { return new Path_obj; }

void *Path_obj::_hx_vtable = 0;

Dynamic Path_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< Path_obj > _hx_result = new Path_obj();
	_hx_result->__construct();
	return _hx_result;
}

bool Path_obj::_hx_isInstanceOf(int inClassId) {
	return inClassId==(int)0x00000001 || inClassId==(int)0x044b6ab5;
}

::String Path_obj::addTrailingSlash(::String path){
            	HX_STACKFRAME(&_hx_pos_6cfed01bf295c856_262_addTrailingSlash)
HXLINE( 263)		if ((path.length == (int)0)) {
HXLINE( 264)			return HX_("/",2f,00,00,00);
            		}
HXLINE( 265)		int c1 = path.lastIndexOf(HX_("/",2f,00,00,00),null());
HXLINE( 266)		int c2 = path.lastIndexOf(HX_("\\",5c,00,00,00),null());
HXLINE( 267)		if ((c1 < c2)) {
HXLINE( 268)			if ((c2 != (path.length - (int)1))) {
HXLINE( 268)				return (path + HX_("\\",5c,00,00,00));
            			}
            			else {
HXLINE( 269)				return path;
            			}
            		}
            		else {
HXLINE( 271)			if ((c1 != (path.length - (int)1))) {
HXLINE( 271)				return (path + HX_("/",2f,00,00,00));
            			}
            			else {
HXLINE( 272)				return path;
            			}
            		}
HXLINE( 267)		return null();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Path_obj,addTrailingSlash,return )

::String Path_obj::removeTrailingSlashes(::String path){
            	HX_STACKFRAME(&_hx_pos_6cfed01bf295c856_287_removeTrailingSlashes)
HXLINE( 288)		while(true){
HXLINE( 289)			 ::Dynamic _g = path.charCodeAt((path.length - (int)1));
HXDLIN( 289)			if (hx::IsNull( _g )) {
HXLINE( 291)				goto _hx_goto_1;
            			}
            			else {
HXLINE( 289)				 ::Dynamic _hx_switch_0 = _g;
            				if (  (_hx_switch_0==(int)47) ||  (_hx_switch_0==(int)92) ){
HXLINE( 290)					path = path.substr((int)0,(int)-1);
HXDLIN( 290)					goto _hx_goto_2;
            				}
            				/* default */{
HXLINE( 291)					goto _hx_goto_1;
            				}
            				_hx_goto_2:;
            			}
            		}
            		_hx_goto_1:;
HXLINE( 294)		return path;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Path_obj,removeTrailingSlashes,return )


Path_obj::Path_obj()
{
}

bool Path_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 16:
		if (HX_FIELD_EQ(inName,"addTrailingSlash") ) { outValue = addTrailingSlash_dyn(); return true; }
		break;
	case 21:
		if (HX_FIELD_EQ(inName,"removeTrailingSlashes") ) { outValue = removeTrailingSlashes_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *Path_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *Path_obj_sStaticStorageInfo = 0;
#endif

static void Path_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Path_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void Path_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Path_obj::__mClass,"__mClass");
};

#endif

hx::Class Path_obj::__mClass;

static ::String Path_obj_sStaticFields[] = {
	HX_HCSTRING("addTrailingSlash","\xe0","\xd6","\xeb","\x26"),
	HX_HCSTRING("removeTrailingSlashes","\x8b","\xdc","\x1d","\x43"),
	::String(null())
};

void Path_obj::__register()
{
	hx::Object *dummy = new Path_obj;
	Path_obj::_hx_vtable = *(void **)dummy;
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("haxe.io.Path","\x05","\xcf","\xc6","\x4e");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &Path_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = Path_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(Path_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< Path_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = Path_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = Path_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = Path_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace haxe
} // end namespace io
