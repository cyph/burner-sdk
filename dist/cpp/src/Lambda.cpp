// Generated by Haxe 3.4.7
#include <hxcpp.h>

#ifndef INCLUDED_Lambda
#include <Lambda.h>
#endif
#ifndef INCLUDED_List
#include <List.h>
#endif

HX_LOCAL_STACK_FRAME(_hx_pos_fe797cbef4e9ff25_141_exists,"Lambda","exists",0x65091043,"Lambda.exists","/usr/share/haxe/std/Lambda.hx",141,0x92dd64dc)
HX_LOCAL_STACK_FRAME(_hx_pos_fe797cbef4e9ff25_185_filter,"Lambda","filter",0x2a5e121f,"Lambda.filter","/usr/share/haxe/std/Lambda.hx",185,0x92dd64dc)

void Lambda_obj::__construct() { }

Dynamic Lambda_obj::__CreateEmpty() { return new Lambda_obj; }

void *Lambda_obj::_hx_vtable = 0;

Dynamic Lambda_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< Lambda_obj > _hx_result = new Lambda_obj();
	_hx_result->__construct();
	return _hx_result;
}

bool Lambda_obj::_hx_isInstanceOf(int inClassId) {
	return inClassId==(int)0x00000001 || inClassId==(int)0x02196def;
}

bool Lambda_obj::exists( ::Dynamic it, ::Dynamic f){
            	HX_STACKFRAME(&_hx_pos_fe797cbef4e9ff25_141_exists)
HXLINE( 142)		{
HXLINE( 142)			 ::Dynamic x = it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic)();
HXDLIN( 142)			while(( (bool)(x->__Field(HX_("hasNext",6d,a5,46,18),hx::paccDynamic)()) )){
HXLINE( 142)				 ::Dynamic x1 = x->__Field(HX_("next",f3,84,02,49),hx::paccDynamic)();
HXLINE( 143)				if (( (bool)(f(x1)) )) {
HXLINE( 144)					return true;
            				}
            			}
            		}
HXLINE( 145)		return false;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Lambda_obj,exists,return )

 ::List Lambda_obj::filter( ::Dynamic it, ::Dynamic f){
            	HX_GC_STACKFRAME(&_hx_pos_fe797cbef4e9ff25_185_filter)
HXLINE( 186)		 ::List l =  ::List_obj::__alloc( HX_CTX );
HXLINE( 187)		{
HXLINE( 187)			 ::Dynamic x = it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic)();
HXDLIN( 187)			while(( (bool)(x->__Field(HX_("hasNext",6d,a5,46,18),hx::paccDynamic)()) )){
HXLINE( 187)				 ::Dynamic x1 = x->__Field(HX_("next",f3,84,02,49),hx::paccDynamic)();
HXLINE( 188)				if (( (bool)(f(x1)) )) {
HXLINE( 189)					l->add(x1);
            				}
            			}
            		}
HXLINE( 190)		return l;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Lambda_obj,filter,return )


Lambda_obj::Lambda_obj()
{
}

bool Lambda_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 6:
		if (HX_FIELD_EQ(inName,"exists") ) { outValue = exists_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"filter") ) { outValue = filter_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *Lambda_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *Lambda_obj_sStaticStorageInfo = 0;
#endif

static void Lambda_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Lambda_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void Lambda_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Lambda_obj::__mClass,"__mClass");
};

#endif

hx::Class Lambda_obj::__mClass;

static ::String Lambda_obj_sStaticFields[] = {
	HX_HCSTRING("exists","\xdc","\x1d","\xe0","\xbf"),
	HX_HCSTRING("filter","\xb8","\x1f","\x35","\x85"),
	::String(null())
};

void Lambda_obj::__register()
{
	hx::Object *dummy = new Lambda_obj;
	Lambda_obj::_hx_vtable = *(void **)dummy;
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("Lambda","\x27","\xa7","\x54","\x85");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &Lambda_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = Lambda_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(Lambda_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< Lambda_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = Lambda_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = Lambda_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = Lambda_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

