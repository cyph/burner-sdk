// Generated by Haxe 3.4.7
#ifndef INCLUDED__List_ListNode
#define INCLUDED__List_ListNode

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_STACK_FRAME(_hx_pos_c88be8751b336a73_255_new)
HX_DECLARE_CLASS1(_List,ListNode)

namespace _List{


class HXCPP_CLASS_ATTRIBUTES ListNode_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef ListNode_obj OBJ_;
		ListNode_obj();

	public:
		enum { _hx_ClassId = 0x69411351 };

		void __construct( ::Dynamic item, ::_List::ListNode next);
		inline void *operator new(size_t inSize, bool inContainer=true,const char *inName="_List.ListNode")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,true,"_List.ListNode"); }

		hx::ObjectPtr< ListNode_obj > __new( ::Dynamic item, ::_List::ListNode next) {
			hx::ObjectPtr< ListNode_obj > __this = new ListNode_obj();
			__this->__construct(item,next);
			return __this;
		}

		static hx::ObjectPtr< ListNode_obj > __alloc(hx::Ctx *_hx_ctx, ::Dynamic item, ::_List::ListNode next) {
			ListNode_obj *__this = (ListNode_obj*)(hx::Ctx::alloc(_hx_ctx, sizeof(ListNode_obj), true, "_List.ListNode"));
			*(void **)__this = ListNode_obj::_hx_vtable;
{
            	HX_STACKFRAME(&_hx_pos_c88be8751b336a73_255_new)
HXLINE( 256)		( ( ::_List::ListNode)(__this) )->item = item;
HXLINE( 257)		( ( ::_List::ListNode)(__this) )->next = next;
            	}
		
			return __this;
		}

		static void * _hx_vtable;
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~ListNode_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		void __Mark(HX_MARK_PARAMS);
		void __Visit(HX_VISIT_PARAMS);
		bool _hx_isInstanceOf(int inClassId);
		::String __ToString() const { return HX_HCSTRING("ListNode","\xa0","\x95","\xb0","\x02"); }

		 ::Dynamic item;
		 ::_List::ListNode next;
};

} // end namespace _List

#endif /* INCLUDED__List_ListNode */ 
