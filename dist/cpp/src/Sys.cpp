// Generated by Haxe 3.4.0
#include <hxcpp.h>

#ifndef INCLUDED_Sys
#include <Sys.h>
#endif

HX_LOCAL_STACK_FRAME(_hx_pos_7ec14b5404d30118_85_systemName,"Sys","systemName",0xbea5b6bb,"Sys.systemName","/usr/share/haxe/std/cpp/_std/Sys.hx",85,0x4e14a6b5)

void Sys_obj::__construct() { }

Dynamic Sys_obj::__CreateEmpty() { return new Sys_obj; }

void *Sys_obj::_hx_vtable = 0;

Dynamic Sys_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< Sys_obj > _hx_result = new Sys_obj();
	_hx_result->__construct();
	return _hx_result;
}

bool Sys_obj::_hx_isInstanceOf(int inClassId) {
	return inClassId==(int)0x00000001 || inClassId==(int)0x003f64ed;
}

::String Sys_obj::systemName(){
            	HX_STACKFRAME(&_hx_pos_7ec14b5404d30118_85_systemName)
HXLINE(  85)		return _hx_std_sys_string();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC0(Sys_obj,systemName,return )


Sys_obj::Sys_obj()
{
}

bool Sys_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 10:
		if (HX_FIELD_EQ(inName,"systemName") ) { outValue = systemName_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *Sys_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *Sys_obj_sStaticStorageInfo = 0;
#endif

static void Sys_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Sys_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void Sys_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Sys_obj::__mClass,"__mClass");
};

#endif

hx::Class Sys_obj::__mClass;

static ::String Sys_obj_sStaticFields[] = {
	HX_HCSTRING("systemName","\xda","\xd8","\x82","\xf7"),
	::String(null())
};

void Sys_obj::__register()
{
	hx::Object *dummy = new Sys_obj;
	Sys_obj::_hx_vtable = *(void **)dummy;
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("Sys","\xed","\x64","\x3f","\x00");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &Sys_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = Sys_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(Sys_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< Sys_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = Sys_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = Sys_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = Sys_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

