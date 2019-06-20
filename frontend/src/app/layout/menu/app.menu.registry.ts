export class AppMenuRegistry {

    private static _menus: any[] = [];

    static registerMenu(category: string, index: number, menuItem: Menu) {
        if (this._menus.length === 0 || this._menus.findIndex(model => model.menuKey === menuItem.menuKey) === -1) {
            this._menus.push({...menuItem, sidebarKey: category, index: index});
        } else {
            console.error(`menu key '${menuItem.menuKey}' already exist`);
        }
    }

    static registerSubMenu(category: string, parent: string, subIndex: number, menuItem: Menu) {
        if (this._menus.length === 0 || this._menus.findIndex(model => model.menuKey === menuItem.menuKey) === -1) {
            this._menus.push({...menuItem, sidebarKey: category, parentKey: parent, index: subIndex});
        } else {
            console.error(`menu key '${menuItem.menuKey}' already exist`);
        }
    }

    static get menus(): any[] {
        return this._menus;
    }

    static init() {
        AppMenuRegistry.registerMenu('features', 100,
            new Menu('welcome', 'Welcome',
                'fa fa-fw fa-tachometer-alt-slow', ['/welcome']));
        AppMenuRegistry.registerMenu('features', 200,
            new Menu('cip', 'CIP',
                'fa fa-fw fa-user', ['/cip']));
        AppMenuRegistry.registerMenu('features', 300,
            new Menu('sp', 'SP',
                'fa fa-fw fa-user', ['/sp']));
        AppMenuRegistry.registerMenu('features', 300,
            new Menu('machine', 'Machine',
                'fa fa-fw fa-laptop', ['/machines']));
    }
}

export class Menu {
    index: number;
    parentKey: string;
    menuKey: string;
    label: string;
    icon: string;
    routerLink: string[];
    hasScope: string;
    items: Menu[];
    i18nProviderName: string;

    constructor(menuKey: string,
                label: string,
                icon: string,
                routerLink: string[],
                hasScope?: string,
                i18nProviderName?: string) {
        this.menuKey = menuKey;
        this.label = label;
        this.icon = icon;
        this.routerLink = routerLink;
        this.hasScope = hasScope;
        this.i18nProviderName = i18nProviderName;
    }
}


